import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Сформировать массив b из массива a  следующим образом: массив  b состоит
 * из тех элементов массива a, которые повторяются в массиве (по одному значению для одинаковых элементов),
 * например, для массива a: 3 7 4 3 8 7 5, массив b будет иметь вид: 3 7.
 */
public class Task29 {

    public static List findElements(int []array){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            for(int j = i+1; j <array.length; j++){
                if(array[i] == array[j]){
                    if(!numbers.contains(new Integer(array[i]))){
                        numbers.add(new Integer(array[i]));
                    }
                }

            }
        }
        return numbers;
    }
    public static int[] listToArray(List list){
        int[] array = new int[list.size()];
        Iterator<Integer> iterator = list.iterator();
        for (int i = 0; i < array.length; i++){
            array[i] = iterator.next();
        }
        return  array;
    }
}
