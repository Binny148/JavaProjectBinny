package methods;
import java.util.Arrays;
public class addToArrays {
    /*
       Create a method that will take a String array and a String.
       Increase your array capacity and add the given String as the last element of the new array.
       Return the new array
    */
    public static void main(String[] args) {
        String [] arr = {"a","e","i","o"};
        System.out.println(Arrays.toString(increaseArrayWithClass(arr,"u")));


    }
    public static String [] increaseArrayWithClass(String [] arr, String word){
        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;

        return newArr;
    }
}
