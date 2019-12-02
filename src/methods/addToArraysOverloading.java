package methods;
import java.util.Arrays;
public class addToArraysOverloading {
    public static void main(String[] args) {
        /*
         Create a method that will take a String array and a String.
       Increase your array capacity and add the given String as the last element of the new array.
       Return the new array
       ---------------------
       Overload the pervious method to take a String array, a String to add to the array,
       and number position where the new element should be added
        */


        String[] arr = {"a", "e", "i", "o"};
        System.out.println(Arrays.toString(increaseArrayWithClass(arr, "u")));
        System.out.println(Arrays.toString(increasedArray(arr, "z", 1)));

    }

    public static String[] increaseArrayWithClass(String[] arr, String word) {
        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;

        return newArr;
    }

    public static String[] increasedArray(String[] arr, String word, int index) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0, j = 0; j < newArr.length; j++) {
            if (index == j) {
                newArr[j] = word;
            } else {
                newArr[j] = word;
                i++;
            }
        }
        return newArr;
    }
}




