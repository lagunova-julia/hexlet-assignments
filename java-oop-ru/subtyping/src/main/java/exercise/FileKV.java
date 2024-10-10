package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;

    public FileKV(String path, Map<String, String> memory) {
        this.path = path;
        var content = Utils.serialize(memory);
        Utils.writeFile(path, content);
    }

    public void set(String key, String value) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.deserialize(content);
        data.put(key, value);
        Utils.writeFile(path, Utils.serialize(data));
    }

    public void unset(String key) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.deserialize(content);
        data.remove(key);
        Utils.writeFile(path, Utils.serialize(data));
    }

    public String get(String key, String defaultValue) {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.deserialize(content);
        return data.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        String content = Utils.readFile(path);
        Map<String, String> data = Utils.deserialize(content);
        return data;
    }
}
// END
