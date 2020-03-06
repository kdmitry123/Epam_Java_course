package Algorithmization.Sorting_Array.Task_8;

import java.util.Arrays;

/**
 * Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
 * которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task_8 {
    public static void main(String[] args) {
        NaturalFraction [] array = {new NaturalFraction(1, 2), new NaturalFraction(2, 4),
                new NaturalFraction(4, 9), new NaturalFraction(5, 8),
                new NaturalFraction(10, 3), new NaturalFraction(11, 13)};

        commonDenominator(array);
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void commonDenominator(NaturalFraction [] arr) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (NaturalFraction element : arr) {
                if (commonDenominator % element.denominator != 0) {
                    isCommon = false;
                }
            }
        }

        for (NaturalFraction element : arr) {
            element.numerator *= commonDenominator / element.denominator;
            element.denominator = commonDenominator;
        }
    }
    
    public static void sortArray (NaturalFraction [] arr) {
        for (int i = arr.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].numerator > arr[j + 1].numerator) {
                    NaturalFraction temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


class NaturalFraction{
    int numerator;
    int denominator;

    public NaturalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator +"/"+ denominator;
    }
}
