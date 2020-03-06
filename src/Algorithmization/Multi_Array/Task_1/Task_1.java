package Algorithmization.Multi_Array.Task_1;

import java.util.Scanner;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task_1 {
    public static void main(String[] args) {
        int[][] array = createMatrix();
        fillingMatrix(array);
        showMatrix(array);
        partialDisplay(array);
    }

    public static int[][] createMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix dimension: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new int[x][y];
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
        System.out.println("--------------------------------------------");
    }

    public static void partialDisplay(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.printf("%3d  ", array[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
    }
}
