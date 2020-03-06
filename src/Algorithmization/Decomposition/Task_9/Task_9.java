package Algorithmization.Decomposition.Task_9;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y — прямой.
 */

public class Task_9 {
    public static void main(String[] args) {
        System.out.printf("Площадь четырехугольника = %.3f", calculateArea(2,4,5,8));
    }

    public static double calculateArea(double x, double y, double z, double t) {
        double area1 = x * y / 2;
        double hypotenuse = Math.sqrt(x * x + y * y);
        double halfPerimeter = (hypotenuse + z + t) / 2;
        double area2 = Math.sqrt(halfPerimeter * (halfPerimeter - hypotenuse) * (halfPerimeter - z) * (halfPerimeter - t));
        return  area1 + area2;
    }
}
