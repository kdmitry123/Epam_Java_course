package Algorithmization.Multi_Array.Task_10;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        int[][] array = createMatrix(n);
        Task_1.showMatrix(array);
        System.out.print("Положительные элементы главной диагонали: ");
        findPositiveElements(array);
    }

    public static int[][] createMatrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        return arr;
    }

    public static void findPositiveElements(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) {
                System.out.printf("%d  ", arr[i][i]);
            }
        }
    }
}
