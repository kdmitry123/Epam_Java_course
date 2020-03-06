package Algorithmization.Multi_Array.Task_12;

import Algorithmization.Multi_Array.Task_1.Task_1;
import Algorithmization.Multi_Array.Task_10.Task_10;

import java.util.Scanner;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task_12 {
    public static boolean isSorted;
    public static int[][] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        array = Task_10.createMatrix(n);
        System.out.println("Исходная матрица:");
        Task_1.showMatrix(array);

        sortRowUp(array);
        System.out.println("Матрица с отсортированными строками по возрастанию:");
        Task_1.showMatrix(array);

        sortRowDown(array);
        System.out.println("Матрица с отсортированными строками по убыванию:");
        Task_1.showMatrix(array);

    }

    private static void sortRowUp (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        isSorted = false;
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }
            }
        }
    }

    private static void sortRowDown (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] < arr[i][j + 1]) {
                        isSorted = false;
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                    }
                }
            }
        }
    }

}
