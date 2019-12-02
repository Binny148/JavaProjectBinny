package methods;

public class printNegNum {
    public static void main(String[] args) {
        /*
        Write a method accepts an int array and a number. Replace any negative numbers in your array with the given number.
         Print the array
        */

        int [] arr = {-1,3,-4,-2,32,2,-23,1};
    }

    public static void printNegativeNumbers(int [] arr){
        for ( int num: arr){
            if(num < 0){
                System.out.println(num);
            }
        }
    }
}
