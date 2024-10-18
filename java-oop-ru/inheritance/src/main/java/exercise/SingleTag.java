package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(
            String name,
            Map<String, String> attribute
    ) {
        super(name, attribute);
    }

    public String toString() {
        Map<String, String> attributes = getAttribute();
        String result = "";
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result += String.format(entry.getKey() + ": %s ", entry.getValue());
        }

        return ("<" + getName() + " " + result).trim() + ">";
    }
}
// END
