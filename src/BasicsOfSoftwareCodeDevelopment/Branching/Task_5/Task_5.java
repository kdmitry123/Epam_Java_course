package BasicsOfSoftwareCodeDevelopment.Branching.Task_5;
/**
 * Вычислить значение функции:
 * x^2 - 3x + 9, если x <= 3;
 * 1 / (x^3 + 6), если x > 3.
 */
public class Task_5 {

    static double functionValue(int x){
        return (x <= 3) ? (x * x - 3 * x + 9) : (1.0 / (x * x * x + 6));
    }

    public static void main(String[] args) {
        System.out.println(functionValue(4));
    }
}
