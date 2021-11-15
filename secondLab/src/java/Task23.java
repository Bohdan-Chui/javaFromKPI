import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Определить индексы и значения равных элементов (если они есть) исходного   одномерного массива a
 */

public class Task23 {

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
    public static List findIndex(List numbers, int[]array){
        List<Integer> index = new ArrayList<Integer>();
           for(int i = 0; i < array.length; i++){
               Iterator<Integer> iterator = numbers.iterator();
               while (iterator.hasNext()) {
               if(iterator.next().intValue() == array[i]){
                   index.add(new Integer(i));
               }
           }
        }
        return index;
    }

    public static void main(String[] args) {
        int len = args.length;
        int []array = {1,2,3,4,2,6,8,9,1,2};

        List<Integer> numbers = findElements(array);
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Numbers: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().intValue() + " ");
        }

        System.out.println("\nindex: ");
        List<Integer> index = findIndex(numbers, array);
        iterator = index.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next().intValue() + " ");
        }
    }

}
