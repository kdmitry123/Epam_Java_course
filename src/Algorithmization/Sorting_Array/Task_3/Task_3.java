package Algorithmization.Sorting_Array.Task_3;

import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class Task_3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(sortBySelection(array)));

    }

    public static int[] sortBySelection(int[] arr) {
        int max;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
