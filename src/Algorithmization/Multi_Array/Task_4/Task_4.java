package Algorithmization.Multi_Array.Task_4;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      .   .   .   ... .
 *      n  n-1 n-2  ... 1
 */

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы n (n-четное): ");
        int n = scanner.nextInt();
        int[][] array = createMatrix(n);
        Task_1.showMatrix(array);
    }

    public static int[][] createMatrix(int n){
        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = array.length - j;
                }
            }
        }
        return array;
    }
}
