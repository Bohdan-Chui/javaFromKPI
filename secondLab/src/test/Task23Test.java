import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {
    int []array = {1,2,3,4,2,6,8,9,1,2};

    @Test
    void findElements() {
        boolean flag = true;
        List<Integer> numbers = Task23.findElements(array);
        Iterator<Integer> iterator = numbers.iterator();
        if(iterator.next().intValue() != 1 ) flag = false;
        if(iterator.next().intValue() != 2 ) flag = false;
        Assert.assertTrue(flag);

    }

    @Test
    void findIndex() {
        boolean flag = true;
        List<Integer> index = Task23.findIndex(Task23.findElements(array), array);
        Iterator<Integer> iterator = index.iterator();
        if(iterator.next().intValue() != 0 ) flag = false;
        if(iterator.next().intValue() != 1 ) flag = false;
        if(iterator.next().intValue() != 4 ) flag = false;
        if(iterator.next().intValue() != 8 ) flag = false;
        if(iterator.next().intValue() != 9 ) flag = false;
        Assert.assertTrue(flag);
    }
}