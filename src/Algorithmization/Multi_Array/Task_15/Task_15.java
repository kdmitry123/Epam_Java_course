package Algorithmization.Multi_Array.Task_15;

import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 *  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task_15 {
    public static int max = 0;
    public static int[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы N: ");
        int n = scanner.nextInt();
        array = createMatrix(n);
        Task_1.showMatrix(array);
        System.out.println("Максимальное значение = " + findMax(array) + "\n");
        replaceWithMax(array);
        Task_1.showMatrix(array);

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

    private static int findMax (int [][] arr) {
        for (int [] array : arr) {
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static void replaceWithMax (int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }
    }
}
