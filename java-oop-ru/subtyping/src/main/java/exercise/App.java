package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> originalMap = storage.toMap();
        Map<String, String> swappedStorage = new HashMap<>();

        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
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
