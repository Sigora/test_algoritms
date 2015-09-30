package algoritms.arrays;

/**
 * Created by starnakin on 29.09.2015.
 */
public class BinarySearch {
    private static int arr[]  = {2, 4, 8, 10, 12, 14};
    private static int arr2[]  = {1, 6, 11, 16, 21, 31};

    public static void main(String[] args) {
        System.out.println(searchRecurcive(arr,0,arr.length-1,10));

        System.out.println(searchRecurcive(arr2,0,arr2.length-1,6));

        System.out.println(searchRecurcive(arr,0,arr.length-1,6));

        System.out.println(searchIterrative(arr,10));

       System.out.println(searchIterrative(arr2,6));

        System.out.println(searchIterrative(arr,6));
    }

    private static int searchRecurcive(int arr[], int start, int end, int number){
        if(end < start){
            return -1;
        }

        int middle = start + (end - start) / 2;

        if(arr[middle] == number){
            return middle;
        }

        if(arr[middle] < number){
            //search in right part
            return searchRecurcive(arr,middle+1, end, number);
        }
        else{
            //search in left part
            return searchRecurcive(arr, start, middle-1, number);
        }
    }

    public static int searchIterrative(int arr[], int number){
        int startIndex = 0;
        int endIndex = arr.length;

        while(startIndex <= endIndex){
            int middleIndex =startIndex + (endIndex - startIndex) / 2;

            if(arr[middleIndex] == number){
                return middleIndex;
            }

            if(arr[middleIndex] < number){
                startIndex = middleIndex + 1;
            }
            else{
                endIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
