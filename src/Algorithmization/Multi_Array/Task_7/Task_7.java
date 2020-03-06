package Algorithmization.Multi_Array.Task_7;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней.
 */

public class Task_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        double[][] array = createMatrix(n);
        System.out.println("Количество положительных элементов = " + numberOfPositiveElements(array));
    }

    public static double[][] createMatrix(int n) {
        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((i * i - j * j) / n);
            }
        }
        return array;
    }

    public static int numberOfPositiveElements(double[][] array) {
        int count = 0;
        for (double[] arr : array) {
            for (double elem : arr) {
                if (elem > 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
