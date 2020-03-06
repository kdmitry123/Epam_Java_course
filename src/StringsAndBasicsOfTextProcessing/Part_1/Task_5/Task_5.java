package StringsAndBasicsOfTextProcessing.Part_1.Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String str = scanner.nextLine();
        System.out.println("-------------------------------------------\n" + removeExtraSpaces(str));
    }

    public static String removeExtraSpaces(String str) {
        String[] array = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                list.add(array[i]);
            }
        }
        return convertToString(list);
    }

    public static String convertToString(List<String> list) {
        String string = "";
        for (String str : list) {
            string += str + " ";
        }
        return string.trim();
    }
}
