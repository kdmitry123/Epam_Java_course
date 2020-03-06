package Algorithmization.Decomposition.Task_11;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task_11 {
    public static void main(String[] args) {
        identifyLargerNumber(123,23);
        identifyLargerNumber(123,233);
        identifyLargerNumber(123,2332);
    }

    public static void identifyLargerNumber(int x, int y){
        String str1 = "" + x;
        String str2 = "" + y;
        int length1 = str1.length();
        int length2 = str2.length();
        if(length1 < length2) {
            System.out.println("Число цифр во втором числе больше");
        } else if(length1 > length2) {
            System.out.println("Число цифр в первом числе больше");
        } else {
            System.out.println("Число цифр в обоих числах равны");
        }
    }
}
