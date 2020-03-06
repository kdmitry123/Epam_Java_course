package StringsAndBasicsOfTextProcessing.Part_1.Task_2;

/**
 *  Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(replaceTheLine("Helloword HellowordHello hello word"));
    }

    public static String replaceTheLine(String str) {
        return str.replaceAll("word", "letter");
    }
}
