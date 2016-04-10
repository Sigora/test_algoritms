package algoritms.arrays;

import java.util.Arrays;

/**
 * Created by starnakin on 25.02.2016.
 */
public class SpiralPrintOf2Darray {

    static int arr2 [][] =   {{1,2,3,4,5,6,7},
                            {8,9,10,11,12,13,14},
                            {15,16,17,18,19,20,21},
                            {22,23,24,25,26,27,28}};

    static int arr [][] =   {{1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25}};

    public static void main(String[] args) {
        //printArray(arr);
        int startRowIndex = 0;
        int startColumnIndex = 0;
        int maxColIndex = arr[0].length - 1;
        int maxRowIndex = arr.length - 1;

        while (startColumnIndex < maxColIndex && startRowIndex < maxRowIndex){
            for(int i = startColumnIndex; i < maxColIndex ; i++){
                System.out.println(arr[startRowIndex][i]);
            }
            System.out.println();
            startRowIndex++;

            for(int i = startRowIndex ; i < maxRowIndex; i++){
                System.out.println(arr[i][maxColIndex]);
            }
            System.out.println();

            maxColIndex--;

            for(int i = maxColIndex; i >= startColumnIndex; i --){
                System.out.println(arr[maxRowIndex][i]);
            }
            System.out.println();
            maxRowIndex --;

            for(int i = maxRowIndex; i >= startRowIndex; i--){
                System.out.println(arr[i][startColumnIndex]);
            }
            System.out.println();

            startColumnIndex ++;
        }
    }

    public static void printArray(int arr [][]){
        Arrays.stream(arr).forEach(x -> Arrays.stream(x).forEach(System.out::println));
    }
}
