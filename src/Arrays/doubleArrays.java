package Arrays;
import java.util.Arrays;
public class doubleArrays {
    public static void main(String[] args) {
        /*
        Declare and initialize double array for price. store following prices
        45.99, 23.5 , 11.50, 33.33, 99.99.
        print the value then change the last elelment to 112.89
        Print all values again

         */

        double [] array = {45.99 , 23.5 , 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(array));
        array[array.length-1] = 112.89;
        System.out.println(Arrays.toString(array));















    }
}
