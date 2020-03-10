package StringsAndBasicsOfTextProcessing.Part_2.Task_6;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task_6 {
    public static void main(String[] args) {
        String str = "Britain is one of the most highly industrialised countries " +
                "in the world: for every person employed in agriculture 12 are employed in industry.";
        System.out.println(repeatCharacter(str));
    }

    public static String repeatCharacter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
