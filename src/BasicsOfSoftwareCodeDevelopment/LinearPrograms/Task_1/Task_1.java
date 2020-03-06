package BasicsOfSoftwareCodeDevelopment.LinearPrograms.Task_1;
/**
 * Найдите значение функции: z=((a-3)*b/2)+c.
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(functionValue(4, 2, 1));
    }

    static double functionValue(int a, int b, int c) {
        return ((((a - 3) * b) / 2) + c);
    }
}
