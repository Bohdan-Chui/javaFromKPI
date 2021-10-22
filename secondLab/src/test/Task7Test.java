import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Task7Test {


    @Test
    void getRandomArray() {
        boolean flag = true;
        int []arr = Task7.getRandomArray(10);
        if(arr.length != 10)
            flag = false;
        Assert.assertTrue(flag);
    }

    @Test
    void leastDefference() {
        int []arr = {1,5,7,-10,-20,98,14,56};
        int result = Task7.leastDefference(arr);
        Assert.assertTrue(result == 2);
    }

    @Test
    void main() {
    }



}
