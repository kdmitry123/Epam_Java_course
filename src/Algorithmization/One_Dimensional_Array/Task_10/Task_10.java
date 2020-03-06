package Algorithmization.One_Dimensional_Array.Task_10;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 *  элемент (освободившиеся элементы заполнить нулями). Примечание: дополнительный массив не использовать.
 */

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array: " + Arrays.toString(array));
        compressionArray(array);
        System.out.println("Compressed array: " + Arrays.toString(array));
    }

    public static void compressionArray(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i += 2) {
            array[i] = 0;
        }
        for (int i = 1, j = 1; i < size; i++, j++) {
            if (i + j < size) {
                array[i] = array[i + j];
            } else {
                array[i] = 0;
            }
        }
    }
}
