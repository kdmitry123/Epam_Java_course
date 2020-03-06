package Algorithmization.Decomposition.Task_4;

import java.util.Scanner;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task_4 {
    private static double maxDistance;

    public static void main(String[] args) {
        int[][] array = initArray();
        int[] res = findMaxDistance(array);
        System.out.printf("Максимальное растояние между точками %d и %d: %.2f", res[0], res[1], maxDistance);
    }

    public static int[][] initArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int n = sc.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.printf("Координаты точки №%d: %n", i + 1);
            System.out.printf("x%d = ", i + 1);
            array[i][0] = sc.nextInt();
            System.out.printf("y%d = ", i + 1);
            array[i][1] = sc.nextInt();
        }
        return array;
    }

    public static double calculateDistance(int[][] array) {
        return Math.sqrt(Math.pow((array[0][0] - array[1][0]), 2)
                + Math.pow((array[0][1] - array[1][1]), 2));
    }

    public static int[] findMaxDistance(int[][] array) {
        int[] result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int[][] currentPoints = {{array[i][0], array[i][1]},
                        {array[j][0], array[j][1]}};
                distance = calculateDistance(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}


