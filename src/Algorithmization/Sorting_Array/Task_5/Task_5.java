package Algorithmization.Sorting_Array.Task_5;

import java.util.Arrays;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2, a3, ... an.
 * Требуется переставить числа в порядке возрастания. Делается это следующим
 * образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <= ... <= an. Берется следующее число a(i+1) и вставляется в после-
 * довательность так, чтобы новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i + 1 до n не будут
 * перебраны. Примечание. Место помещения очередного элемента в отсортированную
 * часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
 * отдельной функции.
 */

public class Task_5 {
    public static void main(String[] args) {
        int [] array = {1, 3, 3, 5, 2, 1, 4, 7, 10, 6, 66, 33, 22, 21, 26, 31, 13, 15, 44, 0};
        System.out.println(Arrays.toString(sortByInsert(array)));
    }

    public static int[] sortByInsert(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                int j = bynSearch(arr, i, arr[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static int bynSearch(int[] arr, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (arr[j] == element) {
                return j;
            } else if (arr[j] < element) {
                firstIndex = j + 1;
            } else if (arr[j] > element && j != 0 && !(arr[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}
