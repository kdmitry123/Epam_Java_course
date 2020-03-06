package StringsAndBasicsOfTextProcessing.Part_2.Task_1;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Task_1 {
    public static void main(String[] args) {
        String str = "Britain  is one    of the most highly industrialised" +
                     " countries in the   world: for every person employed " +
                     "in agriculture 12 are      employed in industry. The original " +
                     "base of British industry    was coal-mining, iron and steel and textiles.";

        System.out.println("Максимальное количество пробелов в тексте = " + findMoreSpaces(str));
    }

    public static int findMoreSpaces(String str) {
        int count = 0;
        int maxLineCounts = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (maxLineCounts < count) {
                    maxLineCounts = count;
                }
                count = 0;
            }
        }
        return maxLineCounts;
    }
}
