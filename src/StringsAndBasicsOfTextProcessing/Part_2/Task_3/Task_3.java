package StringsAndBasicsOfTextProcessing.Part_2.Task_3;

/**
 * Проверить, является ли заданное слово палиндромом.
 */

public class Task_3 {
    public static void main(String[] args) {
        System.out.println(isPolyndrome("qwerewq"));
        System.out.println(isPolyndrome("qwert"));

    }

    public static boolean isPolyndrome(String str) {
        StringBuffer sb = new StringBuffer(str);
        return str.equals(sb.reverse().toString());
    }
}
