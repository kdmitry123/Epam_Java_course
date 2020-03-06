package Algorithmization.Decomposition.Task_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print((char) 27 + "[31m" + "Ввелите количество цифр в числе: ");
        int lengthOfNumber = scanner.nextInt();
        System.out.println((char) 27 + "[33m" + findNaturalNumbers(lengthOfNumber));
    }

    public static List<Integer> findNaturalNumbers(int n) {
        List<Integer> list = new ArrayList<>();
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            String str = "";
            for (int elem : number) {
                str += elem;
            }
            list.add(Integer.parseInt(str));
            number[0]++;
        }
        return list;
    }
}
