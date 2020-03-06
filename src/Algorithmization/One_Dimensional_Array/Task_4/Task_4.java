package Algorithmization.One_Dimensional_Array.Task_4;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array:   " + Arrays.toString(array));
        System.out.println("Modified array: " + Arrays.toString(replaceMinAndMax(array)));
    }

    public static int[] replaceMinAndMax(int[] arr) {
        int indexOfMaxElement = 0;
        int indexOfMinElement = 0;
        int temp = 0;
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[indexOfMaxElement]) {
                indexOfMaxElement = i;
                temp = arr[i];
            } else if (arr[i] < arr[indexOfMinElement]) {
                indexOfMinElement = i;
            }
        }
        temp = arr[indexOfMaxElement];
        arr[indexOfMaxElement] = arr[indexOfMinElement];
        arr[indexOfMinElement] = temp;
        return arr;
    }
}
