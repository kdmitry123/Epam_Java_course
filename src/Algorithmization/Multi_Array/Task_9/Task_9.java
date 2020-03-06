package Algorithmization.Multi_Array.Task_9;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        int[][] array = createMatrix(n);
        Task_1.showMatrix(array);
        maxSummInColumn(array);
    }

    public static int[][] createMatrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static void maxSummInColumn(int[][] arr){
        int maxColumn = 1;
        int maxSum = 0;
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            System.out.printf("%nСумма элементов в %d-м столбце: %d", j + 1, sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }

        System.out.printf("\n\nМаксимальную сумму элементов содержит %d-й столбец", maxColumn);
    }
}
