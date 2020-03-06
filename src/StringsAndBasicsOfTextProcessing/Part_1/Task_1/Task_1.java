package StringsAndBasicsOfTextProcessing.Part_1.Task_1;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Task_1 {
    public static void main(String[] args) {
        String[] listWithCamelCase = {"listInteger", "listByte", "listShort", "listLong"};
        System.out.println(String.join(", " , toSnakeCaseList(listWithCamelCase)));

    }

    public static String [] toSnakeCaseList (String [] camelCaseList) {
        String [] snakeCaseList = new String[camelCaseList.length];
        for (int i = 0; i < snakeCaseList.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < camelCaseList[i].length(); j++) {
                char letter = camelCaseList[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCaseList[i] = strBuilder.toString();
        }
        return snakeCaseList;
    }
}
