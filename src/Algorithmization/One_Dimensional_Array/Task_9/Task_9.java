package Algorithmization.One_Dimensional_Array.Task_9;

import Algorithmization.One_Dimensional_Array.Task_2.Task_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них
 */

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array dimension: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Task_2.createArray(array);
        System.out.println("Source array:   " + Arrays.toString(array));
        System.out.println("Most popular number of array is " + findTheMostPopular(array));
    }

    public static int findTheMostPopular(int[] array) {
        int count;
        int max = 0;
        int size = array.length;
        int[] array_count = new int[size];
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            array_count[i] = count;
            if (count > max)
                max = count;
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (max == array_count[i])
                count++;
        }
        int[] newMass = new int[count];
        count = 0;
        for (int i = 0; i < size; i++) {
            if (array_count[i] == max) {
                newMass[count] = array[i];
                count++;
            }
        }
        int min = newMass[0];
        int newMassSize = newMass.length;
        for (int i = 0; i < newMassSize; i++) {
            if (newMass[i] < min)
                min = newMass[i];
        }
        return min;
    }
}
