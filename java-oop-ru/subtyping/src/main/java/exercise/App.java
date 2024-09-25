package exercise;



// BEGIN
public class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage swappedStorage = new KeyValueStorage();
        var entries = storage.entrySet();
        for (var entry : entries) {
            var key = entry.getKey(); // get key
            var value = entry.get(key); // get value
            swappedStorage.put(value, key);
        }
        return swappedStorage;
    }
}
// END
