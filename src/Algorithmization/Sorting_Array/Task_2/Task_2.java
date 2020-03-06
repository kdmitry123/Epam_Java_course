package Algorithmization.Sorting_Array.Task_2;

import java.util.Arrays;

/**
 *  Даны две последовательности (неубывающие). Образовать из них новую
 *  последовательность чисел так, чтобы она тоже была неубывающей.
 *  Примечание. Дополнительный массив не использовать.
 */


public class Task_2 {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 7, 9};
        int [] array2 = {0, 3, 4, 5, 6, 8};
        int[] rezArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, rezArray, 0, array1.length);
        System.arraycopy(array2, 0, rezArray, array1.length, array2.length);
        Arrays.sort(rezArray);
        System.out.println(Arrays.toString(rezArray));
    }
}
