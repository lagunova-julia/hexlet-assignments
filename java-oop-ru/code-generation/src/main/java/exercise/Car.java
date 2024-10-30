package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    public static String serialize(Car car) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(car);
    }

    @SneakyThrows
    public static Car deserialize(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, Car.class);
    }
    // END
}
