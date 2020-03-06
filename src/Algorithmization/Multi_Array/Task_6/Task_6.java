package Algorithmization.Multi_Array.Task_6;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   1   1  ... 1   1   1
 *      0   1   1  ... 1   1   0
 *      0   0   1  ... 1   0   0
 *      .   .   .  ... .   .   .
 *      0   1   1  ... 1   1   0
 *      1   1   1  ... 1   1   1
 */

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы n (n-четное): ");
        int n = scanner.nextInt();
        int[][] array = createMatrix(n);
        Task_1.showMatrix(array);
    }

    public static int[][] createMatrix(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}