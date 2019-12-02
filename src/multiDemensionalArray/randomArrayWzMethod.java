package multiDemensionalArray;
import java.util.Random;
import java.util.Arrays;
public class randomArrayWzMethod {
    public static void main(String[] args) {
        /*
        Create a method that will generate a random 2D int array. Take two parameters.
        The first one for how many 1D arrays you want, and second how many elements each 1D array should have
        */
        System.out.println(Arrays.deepToString(creatRandom2DArray(4,5)));
    }
    public static int [][] creatRandom2DArray(int numOfArrays, int numOfElements){

        int [][] arr = new int [numOfArrays][numOfElements];
        Random random = new Random();
        for ( int i=0; i<arr.length; i++){
            for ( int j=0; j<arr.length; j++){
                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
}
