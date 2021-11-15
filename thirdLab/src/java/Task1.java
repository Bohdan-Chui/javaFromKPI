/**
 * Вывести таблицу преобразований целых десятичных чисел в
 * интервале от 10 до 100 с шагом 20 в 16-ное представление.
 */

public class Task1 {
    public static void print(int min, int max, int step){
        System.out.println("--------------------------");
        for (int i = min; i < max;i +=step)
        System.out.println(String.format("| int->%d | hex->0x%04X |", i,i));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
            print(10,100,20);
    }
}
