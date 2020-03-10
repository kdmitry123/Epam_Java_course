package StringsAndBasicsOfTextProcessing.Part_2.Task_8;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

public class Task_8 {
    public static void main(String[] args) {
        String str = "Britain is one of the most highly industrialised countries " +
                "in the world: for every person employed in agriculture 12 are employed in industry.";

        System.out.println(findLongest(str));

    }

    public static String findLongest(String str) {
        String word = "";
        int maxLenght = 0;
        String[] line = str.split(" ");
        for (int i = 1; i < line.length; i++) {
            if (line[i].length() > maxLenght) {
                maxLenght = line[i].length();
                word = line[i];
            }
        }
        return word;
    }


}
