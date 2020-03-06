package BasicsOfSoftwareCodeDevelopment.Cycles.Task_5;

import java.util.Scanner;
/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше
 * или равен заданному е. Общий член ряда имеет вид a = (1 / (2^n)) + (1 / (3^n))
 */
public class Task_5 {
    static double n;
    static double a;
    static double e;
    static double sum;

    static double functionValue() {
        sum = 0;
        for (int i = 1; i < n; i++) {
            a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
            if (a >= e) {
                sum += a;
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("e = ");
        e = scanner.nextDouble();
        System.out.print("n = ");
        n = scanner.nextDouble();
        System.out.println(functionValue());
    }
}
