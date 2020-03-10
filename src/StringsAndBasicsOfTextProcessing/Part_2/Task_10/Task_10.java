package StringsAndBasicsOfTextProcessing.Part_2.Task_10;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(countSentences("Hello. Are you ready to work? Yes, I am!"));
    }

    public static int countSentences(String str){
        int count = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(ch == '.' || ch == '!' || ch == '?'){
                count++;
            }
        }
        return count;
    }
}
