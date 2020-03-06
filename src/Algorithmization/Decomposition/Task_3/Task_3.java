package Algorithmization.Decomposition.Task_3;

import java.util.Scanner;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина стороны шестиугольника = ");
        int side = scanner.nextInt();
        System.out.printf("Площадь шестиугольника с длиной сторон %d равна %.3f", side, areaOfHexagon(side));
    }

    private static double areaOfTriangle(int a) {
        return Math.sqrt(3) * a * a / 4;
    }

    private static double areaOfHexagon(int a) {
        return areaOfTriangle(a) * 6;
    }
}
