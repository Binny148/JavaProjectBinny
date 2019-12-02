package Arrays;
import java.util.Arrays;
import java.util.Random;
public class randomArray {
    public static void main(String[] args) {

        // Creat an array with 50 random numbers in the range of 1-100, then print the array

        Random random = new Random();

        int [] arr = new int[50];

        for( int i = 0; i< arr.length; i++){
            int num = random.nextInt(100) +1 ;  // saying the range 0 to 100
            arr[i] = num;

        }
        System.out.println(Arrays.toString(arr));
    }
}
