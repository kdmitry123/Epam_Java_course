package Algorithmization.One_Dimensional_Array.Task_8;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность,
 * выбросив из исходной те члены, которые равны min(a1,a2, ..., an).
 */

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array:   " + Arrays.toString(array) + "; Source array size: " + size);
        int minValue = findMin(array);
        System.out.println("Minimum value in an array is: " + minValue);
        int[] newArray = deleteMin(array, minValue);
        System.out.println("New array: " + Arrays.toString(newArray) + "; New array size: " + newArray.length);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static int[] deleteMin(int[] array, int minValue) {
        int j = 0;
        int size = array.length;
        for (int elem : array) {
            if (elem == minValue) size--;
        }
        int[] newArr = new int[size];
        for (int element : array) {
            if (element != minValue) {
                newArr[j++] = element;
            }
        }
        return newArr;
    }
}
