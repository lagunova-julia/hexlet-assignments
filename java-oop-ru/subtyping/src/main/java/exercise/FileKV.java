package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private Map<String, String> memory;

    public FileKV(String path, Map<String, String> memory) {
        this.memory = memory;
        var content = Utils.serialize(memory);
        Utils.writeFile(path, content);
    }

    public void set(String key, String value) {
        memory.put(key, value);
        var content = Utils.serialize(memory);
        Utils.writeFile(path, content);
    }

    public void unset(String key) {
        memory.remove(key);
        var content = Utils.serialize(memory);
        Utils.writeFile(path, content);
    }

    public String get(String key, String defaultValue) {
        return memory.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return memory;
    }
}
// END
