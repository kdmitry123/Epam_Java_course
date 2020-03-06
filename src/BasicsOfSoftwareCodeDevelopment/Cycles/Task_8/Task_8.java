package BasicsOfSoftwareCodeDevelopment.Cycles.Task_8;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task_8 {
    static Set<Integer> digitsInNumbers(int firstNumber, int secondNumber) {
        Set<Integer> set = new TreeSet<>();
        String firstNumberToString = String.valueOf(firstNumber);
        String secondNumberToString = String.valueOf(secondNumber);
        char[] firsNummerInArray = firstNumberToString.toCharArray();
        char[] secondNumberInArray = secondNumberToString.toCharArray();
        for (char i = 0; i < firsNummerInArray.length; i++) {
            for (char j = 0; j < secondNumberInArray.length; j++) {
                if (firsNummerInArray[i] == secondNumberInArray[j]) {
                    set.add(Character.getNumericValue(firsNummerInArray[i]));
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(digitsInNumbers(firstNumber, secondNumber));
    }
}
