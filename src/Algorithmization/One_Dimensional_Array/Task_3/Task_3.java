package Algorithmization.One_Dimensional_Array.Task_3;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 *  положительных и нулевых элементов.
 */

public class Task_3 {

    private static void compareElements(int arr[]) {
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
            if (arr[i] < 0) {
                countMinus++;
            } else {
                countPlus++;
            }
        }
        System.out.println(countZero + " zero elements, " + countPlus + " positive elements, " + countMinus + " negative elements");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array: " + Arrays.toString(array));
        compareElements(array);
    }

}
