package Algorithmization.Multi_Array.Task_2;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[][] array = createMatrix();
        fillingMatrix(array);
        showMatrix(array);
        showDiagonals(array);
    }

    public static int[][] createMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix dimension: ");
        int x = scanner.nextInt();
        return new int[x][x];
    }

    public static void fillingMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public static void showMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d  ", array[i][j]);
            }
            System.out.println();
        }
        System.out.print("--------------------------");
    }

    public static void showDiagonals(int[][] array) {
        System.out.println("\nЭлементы первой диогонали:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.printf("%3d  ", array[i][j]);
                }
            }
        }
        System.out.println("\nЭлементы второй диогонали:");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (i + j == array.length - 1) {
                    System.out.printf("%3d  ", array[i][j]);
                }
            }
        }
    }
}
