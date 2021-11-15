import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    int[]array = {1,2,1,2,3};

    @Test
    void findElements() {
       ArrayList<Integer> expected =  new ArrayList<Integer>();
       expected.add(new Integer(3));
       assertEquals(Task19.findElements(array), expected);
    }
}