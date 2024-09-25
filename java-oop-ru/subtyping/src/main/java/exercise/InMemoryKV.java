package exercise;

import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> memory;

    public InMemoryKV(Map<String, String> memory) {
        this.memory = memory;
    }

    public void set(String key, String value) {
        memory.put(key, value);
    }

    public void unset(String key) {
        memory.remove(key);
    }

    public String get(String key, String defaultValue) {
        return memory.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return memory;
    }
}
// END
