package StringsAndBasicsOfTextProcessing.Part_2.Task_5;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task_5 {
    public static void main(String[] args) {
        String str = "Britain is one of the most highly industrialised countries " +
                     "in the world: for every person employed in agriculture 12 are employed in industry.";

        System.out.println(countSymbol(str));
    }

    public static int countSymbol(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
