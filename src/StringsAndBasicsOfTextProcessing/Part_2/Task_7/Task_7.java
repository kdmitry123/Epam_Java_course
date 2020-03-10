package StringsAndBasicsOfTextProcessing.Part_2.Task_7;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */

public class Task_7 {
    public static void main(String[] args) {
        String str = "abc cde def fgh hij";
        System.out.println(removeReplays(str));
    }

    public static String removeReplays(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (ch == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
                continue;
            }
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if(stringBuilder.charAt(j) == ch) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return  stringBuilder.toString();
    }
}
