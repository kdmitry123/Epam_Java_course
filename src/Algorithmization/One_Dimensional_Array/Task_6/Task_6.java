package Algorithmization.One_Dimensional_Array.Task_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sequence dimension: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        createArray(array);
        System.out.println("Source sequence: " + Arrays.toString(array));
        System.out.println("The sum of prime numbers is : " + sumOfNumbers(array));
        System.out.println();
    }

    public static double[] createArray(double[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random() * 10 - 5;
        }
        return arr;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static double sumOfNumbers(double[] array) {
        double sum = 0;
        int size = array.length;
        for (int i = 2; i < size; i++) {
            if (isPrimeNumber(i)) {
                sum += array[i];
            }
        }
        return sum;
    }
}
