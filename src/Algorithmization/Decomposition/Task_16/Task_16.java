package Algorithmization.Decomposition.Task_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество цифр в числе: ");
        List<Integer> list = findNumbers(scanner.nextInt());
        System.out.println(list);
        int summ = sumOfNumbers(list);
        System.out.println("Сумма чисел = " + summ);
        System.out.println("Количество четных цифр в найденной сумме = "+ countOfEvenNumbers(summ));
    }

    public static List<Integer> findNumbers(int n) {
        int size = (int) Math.pow(5, n);
        List<Integer> list = new ArrayList<>();
        int firstNumber = 1;
        for (int i = 1; i < n; i++) {
            firstNumber += (int) Math.pow(10, i);
        }
        list.add(0, firstNumber);

        for (int i = 1; i < size; i++) {
            list.add(findNextNumber(list.get(i-1), n));
        }

        return list;
    }

    public static int findNextNumber(int numb, int n) {
        boolean isNext = false;
        while (!isNext) {
            numb += 2;
            isNext = true;
            int m = n;
            while (m > 0) {
                if ((numb / ((int) Math.pow(10, m-- - 1))) % 2 == 0) {
                    isNext = false;
                }
            }
        }
        return numb;
    }

    public static int sumOfNumbers(List<Integer> numbers){
        int sum = 0;
        for (Integer elem : numbers) {
            sum += elem;
        }
        return sum;
    }

    public static int countOfEvenNumbers(int number){
        int count = 0;
        char[] arr = String.valueOf(number).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.getNumericValue(arr[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }


}
