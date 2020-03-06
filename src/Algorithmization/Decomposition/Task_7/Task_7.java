package Algorithmization.Decomposition.Task_7;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task_7 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(sumOfFactorials(array));
    }

    public static int[] createArray(){
        int[] array = new int[5];
        for (int i = 1, j = 0; i < 10; i+=2, j++ ) {
            array[j] = i;
        }
       return array;
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }

    public static int sumOfFactorials (int [] array) {
        int amount = 0;
        for (int element : array) {
            amount += factorial(element);
        }
        return amount;
    }
}
