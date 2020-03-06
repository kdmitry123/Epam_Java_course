package BasicsOfSoftwareCodeDevelopment.LinearPrograms.Task_2;
/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 * (b + sqrt(b*b + 4ac))/2 - a*a*a*c + Math.pow(b, -2);
 */
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(functionValue(1, 2, 3));
    }

    static double functionValue(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);
    }
}
