package Algorithmization.Multi_Array.Task_14;

import Algorithmization.Multi_Array.Task_1.Task_1;

/**
 *  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 *  единиц равно номеру столбца.
 */

public class Task_14 {
    private static int [][] array;

    public static void main(String[] args) {
        createMatrix();
        Task_1.showMatrix(array);
        fillMatrix(array);
        Task_1.showMatrix(array);
    }

    public static void createMatrix() {
        int m = (int) (Math.random() * 15);
        int n = (int) (Math.random() * 15);
        array = new int[m][n];
    }

    public static void fillMatrix (int[][] arr) {
        int count;
        for (int j = 0; j < arr[0].length; j++) {
            count = j + 1;
            for (int i = 0; i < arr.length; i++) {
                if (count > 0) {
                    arr[i][j] = 1;
                    count--;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
    }

}
