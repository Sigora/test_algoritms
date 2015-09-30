package algoritms.arrays;

import java.util.Arrays;

/**
 * Maximum sum such that no two elements are adjacent
 */
public class MaxSumWithoutAdjacent {
    private static int [] arr1 = {5,  5, 10, 40, 50, 35};
    private static int [] arr2 = {3,  2, 7, 10};
    private static int [] arr3 = {3,  2, 5, 10, 7};

    public static void main(String[] args) {
        System.out.println("array" + Arrays.toString(arr1));
        System.out.println("Summ = " + getMaxSum(arr1));
        System.out.println("array" + Arrays.toString(arr2));
        System.out.println("Summ = " + getMaxSum(arr2));
        System.out.println("array" + Arrays.toString(arr3));
        System.out.println("Summ = " + getMaxSum(arr3));
    }

    public static int getMaxSum(int [] arr){
        int sum = 0;
        int sumWithoutPrev = 0;
        int sumWithCurr;

        for (int i = 0; i < arr.length; i ++){
            sumWithCurr = sumWithoutPrev + arr[i];
            sumWithoutPrev = Math.max(sum,sumWithoutPrev);
            sum = sumWithCurr;
        }

        return Math.max(sum, sumWithoutPrev);
    }
}
