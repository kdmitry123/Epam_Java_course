package Algorithmization.Decomposition.Task_8;

import Algorithmization.Decomposition.Task_5.Task_5;

import java.util.Arrays;

/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Task_8 {
    public static void main(String[] args) {
        int[] array = Task_5.createArray();
        System.out.println(Arrays.toString(array));
        System.out.println(summOfElements(array, 1));
        System.out.println(summOfElements(array, 3));
        System.out.println(summOfElements(array, 4));
    }

    private static int summOfElements (int[] arr, int x) {
        int sum = 0;
        for (int i = x - 1; i < x + 2; i++) {
            sum += arr[i];
        }
        return sum;
    }



}
