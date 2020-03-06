package Algorithmization.Decomposition.Task_1;

import java.util.Scanner;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два натуральных числа: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println("Наибольший общий делитель: " + findNOD(a, b));
        System.out.println("Наименьшее общее кратное: " + findNOK(a, b));
    }


    public static int findNOD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < 2; i++) {
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

    public static int findNOK(int a, int b) {
        return Math.abs(a * b / findNOD(a, b));
    }
}
