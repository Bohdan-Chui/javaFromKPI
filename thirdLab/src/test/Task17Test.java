import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    void analiseStr() {
        String[] arr = {"1.2"};
        String expected = new String( Task17.analiseStr(arr));
        assertEquals("1.2 is Decimal Type\n",expected);
    }
}