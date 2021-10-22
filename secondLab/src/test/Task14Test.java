import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    void isUnique() {
        int []array = {1,2,3,4,5,6,7,8,8};
        assertFalse(Task14.isUnique(array));
    }
}