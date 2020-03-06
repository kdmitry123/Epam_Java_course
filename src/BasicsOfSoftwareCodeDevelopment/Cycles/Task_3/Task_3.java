package BasicsOfSoftwareCodeDevelopment.Cycles.Task_3;
/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task_3 {
    static int sumOfSquares() {
        int res = 0;
        for (int i = 1; i < 100; i++) {
            res += i * i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares());
    }

}
