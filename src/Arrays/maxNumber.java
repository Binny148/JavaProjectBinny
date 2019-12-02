package Arrays;
import java.util.Arrays;
public class maxNumber {
    public static void main(String[] args) {
        // Give numbers of 3,30,14,6,50,20
        // Find and print the max or biggest

        int [] arr = { 3, 30, 14, 6, 50, 20 , 102 };
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
