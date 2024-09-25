package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> swappedStorage = new HashMap<>();
        var entries = storage.entrySet();
        for (var entry : entries) {
            var key = entry.getKey(); // get key
            var value = entry.get(key); // get value
            swappedStorage.put(value, key);
        }
    }
}
// END
