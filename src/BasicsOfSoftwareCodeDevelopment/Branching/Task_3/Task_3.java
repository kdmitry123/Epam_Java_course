package BasicsOfSoftwareCodeDevelopment.Branching.Task_3;
/**
 *  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 *  Определить, будут ли они расположены на одной прямой.
 */
public class Task_3 {
    static boolean isPointsOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3){
        return (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1);
    }

    public static void main(String[] args) {
        System.out.println(isPointsOnOneLine(1,1,2,2,3,3));
        System.out.println(isPointsOnOneLine(1,1,2,1,3,1));
        System.out.println(isPointsOnOneLine(1,1,2,2,3,1));
        System.out.println(isPointsOnOneLine(-1,1,-2,1,-3,1));
        System.out.println(isPointsOnOneLine(-1,1,-2,1,-3,2));
    }
}
