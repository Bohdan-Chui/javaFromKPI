
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Выведите на дисплей значения и индексы только тех элементов массива a, значения которых
 * не равны значениям других элементов, т.е. уникальных элементов массива.
 */
public class Task19 {

        public static ArrayList<Integer> findElements(int []array){
            ArrayList<Integer> indexArray = new ArrayList<Integer>();
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if(array[i]==array[j]){
                        indexArray.add(i);
                        indexArray.add(j);
                    }
                }

            }
            ArrayList<Integer> unique = new ArrayList<Integer>();
            for(int i = 0; i < array.length; i++){
                if(!indexArray.contains(i)){
                    unique.add(array[i]);
                }
            }
            return unique;
        }

        public static void print(int[] array, ArrayList<Integer> unique){
            for (int i = 0; i < unique.size();i++){
                for (int j = i+1; j < array.length; j++) {
                    if(array[j] == unique.get(i).intValue()){
                        System.out.println("element-> " + array[j] + " index-> " + j);
                    }
                }
            }
        }


    public static void main(String[] args) {
        int []array = {1,2,1,2,3};
        print(array,findElements(array));
        for (int i:findElements(array)) {
            System.out.println(i);

        }
    }
}
