package StringsAndBasicsOfTextProcessing.Part_3.Task_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 * <note id = "1">
 * <to>Вася</to>
 * <from>Света</from>
 * <heading>Напоминание</heading>
 * <body>Позвони мне завтра!</body>
 * </note>
 * <note id = "2">
 * <to>Петя</to>
 * <from>Маша</from>
 * <heading>Важное напоминание</heading>
 * <body/>
 * </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
 * и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Task_2 {
    public static void main(String[] args) {
        String inputXML = "	<notes>\n" +
                "		<note id = \"1\">\n" +
                "			<to>Вася</to>\n" +
                "			<from>Света</from>\n" +
                "			<heading>Напоминание</heading>\n" +
                "			<body>Позвони мне завтра!</body>\n" +
                "		</note>\n" +
                "		<note id = \"2\">\n" +
                "			<to>Петя</to>\n" +
                "			<from>Маша</from>\n" +
                "			<heading>Важное напоминание</heading>\n" +
                "			</body>\n" +
                "		</note>\n" +
                "	</notes>";

        String rx = "(<([</]?)[\\w \\=\"\\\0-9]*>)([А-Яа-яёЁ ]*)";
        Pattern pattern = Pattern.compile(rx);
        Matcher matcher = pattern.matcher(inputXML);
        while (matcher.find()) {
            if (matcher.group(2).length() == 0) {
                System.out.printf("%-5s%-20s%-20s", "Тег:", matcher.group(1), "Открывающий");
                if (matcher.group(3).length() != 0) System.out.printf("%-30s", "Содержимое: " + matcher.group(3));
                System.out.println();
            } else
                System.out.printf("%-5s%-20s%-20s%n", "Тег", matcher.group(1), "Закрывающий");
        }
    }
}
