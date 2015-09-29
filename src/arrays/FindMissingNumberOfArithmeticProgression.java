package arrays;

/**
 * Created by Sigora on 29.09.2015.
 */
public class FindMissingNumberOfArithmeticProgression {
    private static int arr[]  = {2, 4, 8, 10, 12, 14};
    private static int arr2[]  = {1, 6, 11, 16, 21, 31};

    public static void main(String[] args) {
        int diff = getDiff(arr);
        System.out.println(getMissedElement(arr,0,arr.length-1,diff));
    }

    public static int getDiff(int arr[]){
        return arr[arr.length-1] - arr[0]/arr.length -1;
    }

    public static int getMissedElement(int arr[], int start, int end, int diff){

        if(end <= start){
            return -1;
        }

        int middle =start + (end - start)/2;

        if(arr[middle + 1] - arr[middle] !=diff ){
            return arr[middle] + diff;
        }
        if(middle > 0 && arr[middle] - arr[middle - 1] != diff){
            return arr[middle] - diff;
        }


        if(arr[middle] + diff * )

    }
}
