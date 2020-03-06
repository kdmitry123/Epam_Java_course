package BasicsOfSoftwareCodeDevelopment.Branching.Task_1;
/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */
public class Task_1 {
    static String isTriangle(int x, int y) {
        if ((x + y) >= 180) {
            return "The figure isn't triangle";
        } else if (x == 90 || y == 90 || (x + y) == 90) {
            return "The figure is a right triangle";
        } else {
            return "The figure is triangle, but it isn't a right triangle";
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(150, 30));
        System.out.println(isTriangle(100, 30));
        System.out.println(isTriangle(20, 70));
    }

}
