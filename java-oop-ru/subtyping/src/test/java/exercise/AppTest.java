package java.exercise;


import exercise.App;
import exercise.InMemoryKV;
import exercise.KeyValueStorage;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;


class AppTest {
    @Test
    void testSwapKV() {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value"));
        storage.set("key2", "value2");
        App.swapKeyValue(storage);

        assertEquals(storage.get("key3", "default"), "default");
        assertEquals(storage.get("value", ""), "key");
        assertEquals(storage.get("value2", ""), "key2");
    }

    @Test
    void testSwapKV2() {
        KeyValueStorage storage = new InMemoryKV(Map.of("foo", "bar", "bar", "zoo"));
        App.swapKeyValue(storage);
        Map<String, String> expected = Map.of("bar", "foo", "zoo", "bar");
        assertEquals(storage.toMap(), expected);
    }
}
