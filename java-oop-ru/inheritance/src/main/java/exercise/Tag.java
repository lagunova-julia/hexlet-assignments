package exercise;

import java.util.Map;

// BEGIN
public class Tag {
    protected String name;
    protected Map<String, String> attribute;

    public Tag(String name, Map<String, String> attribute) {
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttribute() {
        return attribute;
    }
}
// END
