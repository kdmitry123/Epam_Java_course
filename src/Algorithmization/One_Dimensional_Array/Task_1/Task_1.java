package Algorithmization.One_Dimensional_Array.Task_1;
/**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task_1 {
    public static boolean isMultiple(int x, int y){
        return (x % y == 0) ? true : false;
    }

    public static void main(String[] args) {
        int[] arr = {-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isMultiple(arr[i], k)) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
