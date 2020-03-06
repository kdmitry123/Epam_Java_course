package StringsAndBasicsOfTextProcessing.Part_2.Task_4;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task_4 {
    public static void main(String[] args) {
        String str = "информатика";
        System.out.println(createWord(str));
    }

    public static String createWord (String str) {
        String word = String.valueOf(str.charAt(str.indexOf('т')));
        word += String.valueOf(str.charAt(str.indexOf('о')));
        word += String.valueOf(str.charAt(str.indexOf('р')));
        word += String.valueOf(str.charAt(str.indexOf('т')));
        return word;
    }

}
