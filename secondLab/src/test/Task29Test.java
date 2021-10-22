import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {
    int []array = {1,2,3,4,2,6,8,9,1,2};


    @Test
    void findElements() {
        boolean flag = true;
        List<Integer> numbers = Task23.findElements(array);
        Iterator<Integer> iterator = numbers.iterator();
        if (iterator.next().intValue() != 1) flag = false;
        if (iterator.next().intValue() != 2) flag = false;
        Assert.assertTrue(flag);
    }

    @Test
    void listToArray() {
        int []arr = Task29.listToArray(Task29.findElements(array));
        boolean flag = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != array[i]){
                flag = false;
            }
        }
        Assert.assertTrue(flag);

    }
}