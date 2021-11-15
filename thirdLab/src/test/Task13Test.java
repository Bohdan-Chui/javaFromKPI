import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    void code() {
        String expected = new String( Task13.decode("uvtkpi",2));
        assertEquals("string",expected);
    }

    @Test
    void decode() {
        String expected = new String( Task13.code("string",2));
        assertEquals("uvtkpi",expected);
    }
}