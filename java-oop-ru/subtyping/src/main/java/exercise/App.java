package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> originalMap = storage.toMap();
        Map<String, String> swappedStorage = new HashMap<>();

        var entries = originalMap.entrySet();
        for (var entry : entries) {
            var key = entry.getKey();
            var value = entry.getValue();
            swappedStorage.put(value, key);
        }

        if (storage instanceof InMemoryKV) {
            storage = new InMemoryKV(swappedStorage);
        } else {
            storage = new FileKV("src/test/resources/file", swappedStorage);
        }
    }
}
// END
