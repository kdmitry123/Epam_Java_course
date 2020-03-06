package Algorithmization.Sorting_Array.Task_4;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел (неубывающая). Требуется
 * переставить числа в порядке возрастания. Для этого сравниваются два соседних
 * числа a(i) и a(i + 1). Если a(i) > a(i + 1), то делается перестановка. Так
 * продолжается до тех пор, пока все элементы не станут расположены в порядке
 * возрастания. Составить алгоритм сортировки, подсчитывая при этом количество
 * перестановок.
 */

public class Task_4 {
    private static int count;
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(sortByExchange(array)));
        System.out.println("Количество перестановок = " + count);
    }

    public static int[] sortByExchange (int [] arr) {
        int temp;
        count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        return arr;
    }
}
