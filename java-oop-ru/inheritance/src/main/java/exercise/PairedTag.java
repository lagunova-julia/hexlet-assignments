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

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            result.append(String.format("%s=\"%s\" ", entry.getKey(), entry.getValue()));
        }

        StringBuilder result2 = new StringBuilder();
        for (Tag tag : tags) {
            result2.append(tag.toString());
        }

        return String.format("<%s %s>%s%s</%s>", getName(), result.toString().trim(), body, result2, getName());
    }
}
// END
