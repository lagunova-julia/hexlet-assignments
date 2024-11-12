package exercise;

import io.javalin.Javalin;

import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        List<String> phones = Data.getPhones();
        List<String> domains = Data.getDomains();
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Передаем обработчик запроса
        app.get("/phones", ctx -> ctx.json(phones));
        app.get("/domains", ctx -> ctx.json(domains));
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
