package Algorithmization.Decomposition.Task_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр,
 * возведенная  в  степень  n,  равна  самому  числу.  Найти  все  числа  Армстронга  от  1  до  k.  Для  решения  задачи
 * использовать декомпозицию.
 */

public class Task_14 {
    public static void main(String[] args) {
        System.out.println(printArmstrongNumbers(100_000_000));
    }

    public static int lenghtOfTheNumber(int n) {
        int length = 0;
        while (n >= 1) {
            length++;
            n /= 10;
        }
        return length;
    }

    public static boolean isArmstrong(int number) {
        int sum = 0;

        int[] arr = new int[lenghtOfTheNumber(number)];
        int n = number;
        for (int i = arr.length; i > 0; i--) {
            arr[i - 1] = n - (n / 10) * 10;
            n /= 10;
        }
        for (int elem : arr) {
            int inDegree = elem;
            for (int j = 1; j < arr.length; j++) {
                inDegree *= elem;
            }
            sum += inDegree;
        }

        return number == sum;
    }

    public static List<Integer> printArmstrongNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (isArmstrong(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
