package methods;
import java.util.Arrays;
public class arrayMethod {
    public static void main(String[] args) {


        /*
        write a merthod an int array and a number . repalce any negative numbers in your array with the given number.
        print the array
        */


       int []  arr2 = {-1,3,-4,-2,32,3,-23,1};
       //changeNegativeNumbers(arr2, 100);   // change all -ve to 100
        arraysToString(arr2);
    }
    public static void changeNegativeNumbers(int [] arr, int change){
        for( int i = 0; i< arr.length; i++){
            if (arr[i] < 0){
                arr[i] = change;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void arraysToString (int [] arr){
        String result = "[";
        for (int num : arr){
            result += num + ",";
        }
        result = result.substring(0, result.length()-2) + "]";
        System.out.println(result);
    }
}
