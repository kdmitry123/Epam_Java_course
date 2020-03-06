package Algorithmization.Multi_Array.Task_5;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *   1   1   1  ... 1   1   1
 *   2   2   2  ... 2   2   0
 *   3   3   3  ... 3   0   0
 *   .   .   .  ... .   .   .
 *  n-1 n-1  0  ... 0   0   0
 *   n   0   0  ... 0   0   0
 */

public class Task_5 {
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
                if (n - (i + j) <= 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i + 1;
                }
            }
        }
        return array;
    }
}
