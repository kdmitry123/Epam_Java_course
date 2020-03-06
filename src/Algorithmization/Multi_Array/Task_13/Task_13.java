package Algorithmization.Multi_Array.Task_13;

import Algorithmization.Multi_Array.Task_1.Task_1;
import Algorithmization.Multi_Array.Task_10.Task_10;

import java.util.Scanner;

/**
 *  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task_13 {
    public static boolean isSorted;
    public static int[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        array = Task_10.createMatrix(n);
        System.out.println("Исходная матрица:");
        Task_1.showMatrix(array);

        sortColumnUp(array);
        System.out.println("Матрица с отсортированными строками по возрастанию:");
        Task_1.showMatrix(array);

        sortColumnDown(array);
        System.out.println("Матрица с отсортированными строками по убыванию:");
        Task_1.showMatrix(array);


    }

    private static void sortColumnUp (int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i][j] > arr[i + 1][j]) {
                        isSorted = false;
                        int temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                    }
                }
            }
        }
    }

    private static void sortColumnDown (int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i][j] < arr[i + 1][j]) {
                        isSorted = false;
                        int temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                    }
                }
            }
        }
    }
}
