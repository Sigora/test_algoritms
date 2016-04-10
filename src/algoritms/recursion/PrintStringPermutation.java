package algoritms.recursion;

/**
 * Created by starnakin on 25.02.2016.
 */
public class PrintStringPermutation {

    public static void main(String[] args) {
        String str = "ABC";

        printPermutation(str.toCharArray(), 0, str.length() - 1);
    }

    public static void printPermutation(char [] str, int left, int right){

        if(left == right){
            System.out.println(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            exchenge(str, left, i);
            printPermutation(str, left + 1, right);
            exchenge(str,i, left);
        }
    }

    public static void exchenge(char [] arr, int left, int right){

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
