package Algorithmization.Decomposition.Task_10;

import java.util.Arrays;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */

public class Task_10 {
    public static void main(String[] args) {
        int[] arr = createArray(12345);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] createArray(int x){
        String str = "" + x;
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Character.getNumericValue(str.charAt(i));
        }
        return array;
    }
}
