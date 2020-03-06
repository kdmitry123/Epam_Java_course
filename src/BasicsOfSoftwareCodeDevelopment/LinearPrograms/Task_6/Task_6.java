package BasicsOfSoftwareCodeDevelopment.LinearPrograms.Task_6;
/**
 * Для данной области составить линейную программу, которая печатает true, если точка
 * с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
 */
public class Task_6 {
    static boolean pointCheck(int x, int y) {
        return (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }

    public static void main(String[] args) {
        System.out.println(pointCheck(3, 3));
        System.out.println(pointCheck(3, -3));
    }
}
