package Algorithmization.Sorting_Array.Task_1;

import java.util.Arrays;

/**
 *  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 *  один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 *  дополнительный массив.
 */

public class Task_1 {

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 2, 3};
        int[] array2 = new int[]{4, 5, 6, 7, 8, 9};
        int k = 2;

        if(k > array1.length) {
            System.out.println("Значение k не должно превышать длину первого массива.");
        } else {
            int[] rezArray = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, rezArray, 0, array1.length);
            System.arraycopy(array2, 0, rezArray, k, array2.length);
            System.arraycopy(array1, k, rezArray, k + array2.length, array1.length - k);
            System.out.println(Arrays.toString(rezArray));
        }
    }
}
