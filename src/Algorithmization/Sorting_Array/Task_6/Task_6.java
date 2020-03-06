package Algorithmization.Sorting_Array.Task_6;

import java.util.Arrays;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 * его по возрастанию. Делается это следующим образом: сравниваются два сосед-
 * них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
 * элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
 * тся на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 2, 1, 4, 7, 10, 6, 66, 33, 22, 21, 26, 31, 13, 15, 44, 0};
        System.out.println(Arrays.toString(sortShell(array)));
    }

    public static int[] sortShell(int[] arr) {
        int temp;
        int i = 1;
        while (i < arr.length) {
            if (arr[i - 1] > arr[i]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return arr;
    }
}
