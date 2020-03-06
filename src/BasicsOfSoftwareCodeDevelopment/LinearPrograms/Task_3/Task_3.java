package BasicsOfSoftwareCodeDevelopment.LinearPrograms.Task_3;

import static java.lang.Math.*;
/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y)
 */
public class Task_3 {
    public static void main(String[] args) {
        System.out.println(functionValue(30, 45));
    }

    static double functionValue(double x, double y) {
        double xInRadians = toRadians(x);
        double yInRadians = toRadians(y);
        return (sin(xInRadians) + cos(yInRadians)) / (cos(xInRadians) - sin(yInRadians)) * tan(xInRadians * yInRadians);
    }
}
