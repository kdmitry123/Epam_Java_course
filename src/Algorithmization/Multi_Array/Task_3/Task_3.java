package Algorithmization.Multi_Array.Task_3;
import Algorithmization.Multi_Array.Task_1.Task_1;

import java.util.Scanner;

/**
 *  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_3 {
    public static void main(String[] args) {
        int[][] array = Task_1.createMatrix();
        Task_1.fillingMatrix(array);
        Task_1.showMatrix(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line number(k): ");
        int k = scanner.nextInt();
        System.out.print("Enter column number(p): ");
        int p = scanner.nextInt();
        System.out.println("--------------------------------------------");

        System.out.print("Line №" + k + ":  ");
        for (int j = 0; j < array[k].length; j++) {
            System.out.printf("%3d ", array[k - 1][j]);
        }
        System.out.println("\n--------------------------------------------");
        System.out.printf("Column №%d:  %d%n", p, array[0][p - 1]);
        for (int i = 1; i < array.length; i++) {
            System.out.printf("%15d%n", array[i][p - 1]);
        }
    }
}
