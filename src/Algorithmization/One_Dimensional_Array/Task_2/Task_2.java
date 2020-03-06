package Algorithmization.One_Dimensional_Array.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z,
 * этим числом. Подсчитать количество замен.
 */

public class Task_2 {

    public static int[] createArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round((Math.random() * 100) - 50);
        }
        return arr;
    }

    private static void compareElements(int z, int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Replacements = 0");
        } else {
            System.out.println("The count of change: " + count);
        }
        System.out.println("The final sequence is: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sequence dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        createArray(array);
        System.out.println("Source sequence: " + Arrays.toString(array));
        System.out.print("Z = ");
        int z = scanner.nextInt();
        compareElements(z, array);
    }
}
