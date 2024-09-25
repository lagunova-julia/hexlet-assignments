package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import com.fasterxml.jackson.databind.ObjectMapper;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    void FileKVTest1() {
        KeyValueStorage storage = new FileKV("src/test/resources/file", Map.of("key", "value"));
        assertThat(storage.get("key2", "default")).isEqualTo("default");
        assertThat(storage.get("value", "default")).isEqualTo("key");

        storage.set("key2", "value2");
        storage.set("key", "value3");

        assertThat(storage.get("value2", "default")).isEqualTo("key2");
        assertThat(storage.get("value3", "default")).isEqualTo("key");

        storage.unset("value3");
        assertThat(storage.get("value3", "def")).isEqualTo("def");
        assertThat(storage.toMap()).isEqualTo(Map.of("value2", "key2"));
    }

    // END
}
