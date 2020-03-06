package Algorithmization.Decomposition.Task_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task_5 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        int i = findSecond(array);
        System.out.println("Второе по величине значение = " + i);
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность массива = ");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100) - 50);
        }
        return arr;
    }

    public static int findSecond(int[] array) {
        Arrays.sort(array);
        int i = array.length - 2;
        int j = array[i];
        while (j == array[i + 1]) {
            i--;
            j = array[i];
        }
        return j;
    }

}
