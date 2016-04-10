package algoritms.longestsubsequence;

/**
 * Created by starnakin on 01.03.2016.
 */
public class LongestContinuesSub01 {

    public static int arr[] =  {1, 1, 1, 1, 0};

    public static void main(String[] args) {
        System.out.println(getIndexOfZeroToBeChanged(arr));
    }

    public static int getIndexOfZeroToBeChanged(int arr []){
        int onesBefore = 0;
        int onesAfter = 0;
        int max = 0;
        int index = -1;
        boolean wasZero = false;

        for(int i = 0; i < arr.length; i ++){
            if(wasZero){
                onesAfter++;
            }

            if(arr[i] != 0) {
                onesBefore++;
            }
            else{
                wasZero = true;
                if(max < onesBefore + onesAfter){
                    max = onesBefore + onesAfter;
                    index = max - onesAfter;
                }
                onesBefore = onesAfter;
                onesAfter = 0;
            }
        }

        return index;
    }

}
