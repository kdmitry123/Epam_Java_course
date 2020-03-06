package BasicsOfSoftwareCodeDevelopment.Cycles.Task_7;

import java.util.Scanner;
/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task_7 {
    static int m;
    static int n;
    static boolean isDevision = false;

    static void getDividers(){
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isDevision = true;
                    System.out.print(j + ", ");
                }
            }
            if (!isDevision) {
                System.out.print("отсутствуют, ");
            }
            isDevision = false;
            System.out.println("\b\b.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        m = scanner.nextInt();
        System.out.print("n = ");
        n = scanner.nextInt();
        getDividers();
    }
}
