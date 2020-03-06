package Algorithmization.Decomposition.Task_13;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
 * использовать декомпозицию.
 */

public class Task_13 {

    public static void main(String[] args) {
        int n = 15;
        int [][] twinNumbers = findTwin(n);
        System.out.printf("Числа \"близнецы\" в интервале от %d до %d:%n", n, n * 2);
        printMatrix(twinNumbers);
    }

    private static int [][] findTwin (int n) {
        int [][] twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix (int [][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }
}
