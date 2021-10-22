public class Task14 {
    /**
     * Проверьте, являются ли элементы массива a множеством (для этого среди элементов массива не должно быть двух элементов с одинаковым значением)
     *
     */
    public static boolean isUnique(int[]arr){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1 ;j < arr.length; j++)
                if(arr[i] == arr[j])
                    flag = false;
        }
    return flag;
    }

    public static void main(String[] args) {
        int []array = {1,2,2,4,5,6,7,8};
        System.out.println(isUnique(array));
    }
}
