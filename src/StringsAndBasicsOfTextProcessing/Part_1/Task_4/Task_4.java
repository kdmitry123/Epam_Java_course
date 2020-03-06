package StringsAndBasicsOfTextProcessing.Part_1.Task_4;

import java.util.Scanner;

/**
 * В строке найти количество чисел.
 */

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String srt = scanner.nextLine();
        System.out.println("Количество чисел во введенной строке = " + countNumbers(srt));

    }

    public static int countNumbers(String str) {
        String[] array = str.split(" ");
        int count = 0;
        for (String elem : array) {
            try {
                int temp = Integer.parseInt(elem);
                count++;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return count;
    }
}
