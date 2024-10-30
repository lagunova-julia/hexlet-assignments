package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import lombok.SneakyThrows;

import static exercise.Car.deserialize;
import static exercise.Car.serialize;

// BEGIN
public class App {
    @SneakyThrows
    public static void save(Path filepath, Car car) {
        String carAsString = serialize(car);
        Files.writeString(filepath, carAsString);
    }

    @SneakyThrows
    public static Car extract(Path filepath) {
        String carAsString = Files.readString(filepath);
        return deserialize(carAsString);
    }
}
// END
