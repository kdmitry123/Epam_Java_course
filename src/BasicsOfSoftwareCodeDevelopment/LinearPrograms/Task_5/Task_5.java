package BasicsOfSoftwareCodeDevelopment.LinearPrograms.Task_5;
/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */
public class Task_5 {
    static String transformTime(int inputSeconds) {
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds = inputSeconds % 60;
        return hours + "ч " + minutes + "мин " + seconds + "с";
    }

    public static void main(String[] args) {
        System.out.println(transformTime(3721));
    }
}
