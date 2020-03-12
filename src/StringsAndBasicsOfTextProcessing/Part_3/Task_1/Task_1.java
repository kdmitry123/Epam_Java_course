package StringsAndBasicsOfTextProcessing.Part_3.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */

public class Task_1 {
    public static void main(String[] args) throws IOException {
        String text = "Hibernate is one of the most popular Java Persistence API (JPA)\n" +
                "implementations and also one of the most popular Java Object Relational\n" +
                "Mapping (ORM) frameworks in general. It helps you to map the classes of your\n" +
                "domain model to database tables and automatically generate SQL statements to\n" +
                "update the database on object state transitions. That is a complex task, but\n" +
                "Hibernate makes it look easy. You just annotate your domain classes, and\n" +
                "Hibernate takes care of the rest. Or, it at least seems like that in the beginning.";
        operationsWithText(text);
    }

    public static String[] splitSentences(String str) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(str);
    }

    public static String[] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }

    public static void sortParagraphs(String str) {
        String[] paragraph = str.split("\n");
        int[] counterSentences = new int[paragraph.length];
        int maxLength = 0;
        for (int i = 0; i < paragraph.length; i++) {
            String[] sentences = splitSentences(paragraph[i]);
            counterSentences[i] = sentences.length;
            if (maxLength < sentences.length) {
                maxLength = sentences.length;
            }
        }
        for (int i = 1; i <= maxLength; i++) {
            for (int j = 0; j < counterSentences.length; j++) {
                if (i == counterSentences[j]) {
                    System.out.println(paragraph[j]);
                }
            }
        }
        System.out.println();
    }

    public static void sortWords(String str) {
        String[] paragraphs = str.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        if (words[m].length() > words[m + 1].length()) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sortLexemes(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите символ для сортировки лексем по убыванию: ");
        String letter = reader.readLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void operationsWithText(String text) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- введите \"1\" для сортировки абзацев по количеству предложений; \n" +
                "- введите \"2\" для сортировки в каждом предложении слов по длине;\n" +
                "- введите \"3\" для сортировки лексем в предложениях по убыванию количества \n" +
                "  вхождений заданного символа, а в случае равенства - по алфавиту.\n" +
                "Для завершения работы приложения введите \"q\"\n";
        String choice = "";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("q")) {
            System.out.print("Введите команду: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortParagraphs(text);
                    break;
                case "2":
                    sortWords(text);
                    break;
                case "3":
                    sortLexemes(text);
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Неверная команда. Повторите ввод команды.\n");
            }
        }
    }
}
