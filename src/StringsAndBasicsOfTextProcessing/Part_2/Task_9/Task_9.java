package StringsAndBasicsOfTextProcessing.Part_2.Task_9;

import java.util.HashMap;
import java.util.Map;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */

public class Task_9 {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<String, Integer> map = countLowerAndUpperCases(str);
        System.out.println(map);
    }

    public static Map<String, Integer> countLowerAndUpperCases(String str) {
        Map<String, Integer> map = new HashMap<>();
        int tempLowerCase = 0;
        int tempUpperCase = 0;
        map.put("LowerCase", tempLowerCase);
        map.put("UpperCase", tempUpperCase);
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                map.put("LowerCase", ++tempLowerCase);
                continue;
            }
            if (letter >= 'A' && letter <= 'Z') {
                map.put("UpperCase", ++tempUpperCase);
            }
        }
        return map;
    }
}
