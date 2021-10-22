import java.util.Random;


public class Task7 {
    public static int[]  getRandomArray(int number) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rd.nextInt() % 101; // storing random integers in an array
        return arr;
    }

    public static int leastDefference(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                int tempMin = Math.abs(args[i] - args[j]);
                if (tempMin < min)
                    min = tempMin;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = getRandomArray(10);
        for (int b:array) {
            System.out.print(b + " ");
        }
        System.out.println("\n"+leastDefference(array));

    }



}
