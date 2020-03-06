package Algorithmization.Multi_Array.Task_11;

import Algorithmization.Multi_Array.Task_1.Task_1;


/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task_11 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int[][] array = createMatrix(x,y);
        Task_1.showMatrix(array);
        findStrings(array);
    }

    public static int[][] createMatrix(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 15);
            }
        }
        return arr;
    }

    public static void findStrings(int[][] arr){
        System.out.print("\nСтроки, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.println("\b\b");
    }
}
