import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @Test
    void hexToBinary() {
        String result = new String(Task39.hexToBinary("c"));
        assertEquals("hex-> c binary-> 1100", result);
    }

    @Test
    void hexToBin() {
        assertEquals("1100", Task39.hexToBin("C"));
    }
}