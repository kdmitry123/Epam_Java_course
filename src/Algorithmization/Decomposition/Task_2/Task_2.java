package Algorithmization.Decomposition.Task_2;

import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре натуральных числа:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Наибольший общий делитель для введенных чисел = " + findNOD(numbers));

    }

    public static int findNOD(int [] numbers) {
        int a = Math.abs(numbers[0]);
        for (int element : numbers) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }
}
