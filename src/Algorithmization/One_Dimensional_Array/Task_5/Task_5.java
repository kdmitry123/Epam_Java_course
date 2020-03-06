package Algorithmization.One_Dimensional_Array.Task_5;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array:   " + Arrays.toString(array));
        compareElements(array);

    }

    private static void compareElements(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] > i)
                System.out.println("Value " + arr[i] + " is greater than its index [" + i + "]");
        }
    }
}
