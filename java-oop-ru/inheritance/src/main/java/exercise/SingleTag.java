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
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result.append(String.format("%s=\"%s\" ", entry.getKey(), entry.getValue()));
        }
        return String.format("<%s %s>", getName(), result.toString().trim());
    }
}
// END
