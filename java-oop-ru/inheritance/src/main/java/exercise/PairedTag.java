package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> tags;

    public PairedTag(
            String name,
            Map<String, String> attribute,
            String body,
            List<Tag> tags
    ) {
        super(name, attribute);
        this.body = body;
        this.tags = tags;
    }

    public String toString() {
        Map<String, String> attributes = getAttribute();
        String result = "";
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result += String.format(entry.getKey() + ": %s ", entry.getValue());
        }
        String result2 = "";
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                result2 += tags.get(i).toString();
            }
        }

        return ("<" + getName() + " " + result).trim() + ">"
                + body + result2 + "</" + getName() + ">";
    }
}
// END
