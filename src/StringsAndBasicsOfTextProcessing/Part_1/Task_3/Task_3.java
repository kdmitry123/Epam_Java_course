package StringsAndBasicsOfTextProcessing.Part_1.Task_3;

import java.util.Scanner;

/**
 * В строке найти количество цифр.
 */

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String srt = scanner.nextLine();
        System.out.println("Количество цифр во введенной строке = " + countDigits(srt));
    }

    public static int countDigits(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                count++;
            }
        }
        return count;
    }
}
