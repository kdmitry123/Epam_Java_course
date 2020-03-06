package Algorithmization.Decomposition.Task_6;

import java.util.Scanner;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task_6 {
    public static void main(String[] args) {
        int[] array = initArray();
        System.out.println(isMutuallySimple(array) ? "Введенные числа являются взаимно простыми" : "Введенные числа не являются взаимно простыми");
    }


    public static int[] initArray() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите число №%d: ", i + 1);
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findNOD(int[] arr) {
        int a = Math.abs(arr[0]);
        for (int elem : arr) {
            int b = Math.abs(elem);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

    public static boolean isMutuallySimple(int[] a) {
        return findNOD(a) == 1;
    }
}
