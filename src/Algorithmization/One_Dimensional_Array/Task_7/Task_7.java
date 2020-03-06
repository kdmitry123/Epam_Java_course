package Algorithmization.One_Dimensional_Array.Task_7;

import Algorithmization.One_Dimensional_Array.Task_6.Task_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны действительные числа a1, a2, a3 ... an. Найти max(a1 + a2, a2 + a3, ..., an + a(n+1).
 */

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sequence dimension: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        Task_6.createArray(array);
        System.out.println("Source sequence: " + Arrays.toString(array));
        System.out.println("The maximum amount is " + findMaxSumm(array));
    }

    public static double findMaxSumm(double[] arr){
        int size = arr.length;
        double max = arr[0] + arr[1];
        for (int i = 0; i < size - 1; i++) {
            if ((arr[i] + arr[i + 1]) > max)
                max = arr[i] + arr[i + 1];
        }
        return max;
    }
}
