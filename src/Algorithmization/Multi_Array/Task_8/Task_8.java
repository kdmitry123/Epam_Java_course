package Algorithmization.Multi_Array.Task_8;

import Algorithmization.Multi_Array.Task_1.Task_1;
import Algorithmization.Multi_Array.Task_5.Task_5;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class Task_8 {
    static int a;
    static int b;
    static int[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы n: ");
        int n = scanner.nextInt();
        array = Task_5.createMatrix(n);
        Task_1.showMatrix(array);
        System.out.println("Введите номера столбцов, которые нужно поменять местами: ");
        a = scanner.nextInt() - 1;
        b = scanner.nextInt() - 1;
        changeOfElements();
        Task_1.showMatrix(array);
    }

    public static void changeOfElements() {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][a];
            array[i][a] = array[i][b];
            array[i][b] = temp;
        }
    }

}
