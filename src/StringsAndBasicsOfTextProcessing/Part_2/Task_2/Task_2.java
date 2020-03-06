package StringsAndBasicsOfTextProcessing.Part_2.Task_2;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task_2 {
    public static void main(String[] args) {
        String str = "Britain is one of the most highly industrialised countries " +
                     "in the world: for every person employed in agriculture 12 are employed in industry.";

        System.out.println(replaceCharacter(str));
    }

    public static String replaceCharacter(String str) {
        return str.replaceAll("a", "ab");
    }
}
