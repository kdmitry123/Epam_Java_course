package Algorithmization.Decomposition.Task_12;

import java.util.Arrays;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task_12 {
    public static void main(String[] args) {
        int [] array = createArray(71, 5);
        System.out.println(Arrays.toString(array));
        System.out.println("ПРОВЕРКА: сумма элементов массива = " + sumElements(array));
    }

    public static int [] createArray (int k, int n) {
        int [] arr1 = new int[k];
        int i;
        for (i = 0; i < arr1.length && k > n; i++) {
            arr1[i] = (int) (Math.random() * n) + 1;
            k -= arr1[i];
        }
        arr1[i] = k;
        int [] arr2 = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            arr2[j] = arr1[j];
        }
        return arr2;
    }

    public static int sumElements(int[] array){
        int summ = 0;
        for (int elem : array) {
            summ += elem;
        }
        return summ;
    }

}
