package Algorithmization.Decomposition.Task_17;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task_17 {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Количество действий = " + substractionOfNumbers(number));
        System.out.println(list);
    }

    public static int summOfDigits(int number) {
        int summ = 0;
        char[] arr = String.valueOf(number).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            summ += Character.getNumericValue(arr[i]);
        }
        return summ;
    }

    public static int substractionOfNumbers(int number){
        while (number > 0) {
            number -= summOfDigits(number);
            list.add(number);
        }
        return list.size();
    }
}
