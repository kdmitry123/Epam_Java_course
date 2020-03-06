package BasicsOfSoftwareCodeDevelopment.Cycles.Task_2;

import java.util.ArrayList;
import java.util.List;
/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = {x, x > 2;
 *      -x, x <=2}
 */
public class Task_2 {
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    static void functionValue(int a, int b, int h) {
        for (int i = a; i <= b; i += h) {
            if(i > 2) {
                list1.add(i);
            } else {
                list2.add(-i);
            }
        }
    }

    public static void main(String[] args) {
        functionValue(-10,20,2);
        System.out.println("Значения при х > 2: " + list1);
        System.out.println("Значения при х <= 2: " + list2);
    }

}
