package BasicsOfSoftwareCodeDevelopment.Branching.Task_4;
/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task_4 {
    static boolean isPassing(int a, int b, int x, int y, int z) {
        return (a >= x && b >= y) || (a >= x && b >= z) || (a >= z && b >= y);
    }

    public static void main(String[] args) {
        System.out.println(isPassing(3, 3, 3, 3, 4));
        System.out.println(isPassing(3, 3, 4, 3, 4));
    }
}
