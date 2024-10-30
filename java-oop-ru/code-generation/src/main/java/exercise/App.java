package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import static exercise.Car.deserialize;
import static exercise.Car.serialize;

// BEGIN
public class App {
    //save() — принимает в качестве аргумента путь к файлу (объект класса Path)
    // и объект класса Car. Метод сохраняет представление объекта в файл по
    // переданному пути. Чтобы сохранить объект в файл, вам нужно будет представить
    // его в виде строки (сериализовать).
    //extract() — принимает в качестве аргумента путь к файлу (объект класса Path),
    // в котором содержится JSON представление объекта Car и возвращает инстанс класса
    // Car с соответствующими свойствами.
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
