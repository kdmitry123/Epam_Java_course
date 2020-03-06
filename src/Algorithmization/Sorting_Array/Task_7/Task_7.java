package Algorithmization.Sorting_Array.Task_7;

import java.util.Arrays;

/**
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */

public class Task_7 {
    public static void main(String[] args) {
        int[] array1 = {2, 7, 9};
        int[] array2 = {1, 3, 4, 5, 6, 8};
        int[] newArray = array1;

        for (int element : array2) {
            int pointInsert = nextInsert(newArray, element);
            int[] temp = new int[newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (pointInsert > i) {
                    temp[i] = newArray[i];
                } else if (pointInsert == i) {
                    temp[i] = element;
                    temp[i + 1] = newArray[i];
                } else {
                    temp[i + 1] = newArray[i];
                }
            }
            newArray = temp;
            System.out.printf("%nПозиция вставки элемента - %d: значение = %d", element, pointInsert);
            System.out.println("\n" + Arrays.toString(newArray));
        }

    }

    public static int nextInsert(int[] arr, int elem) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (arr[j] == elem) {
                return j;
            } else if (arr[j] < elem) {
                firstIndex = j + 1;
            } else if (arr[j] > elem && j != 0 && !(arr[j - 1] < elem)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}
