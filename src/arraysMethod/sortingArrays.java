package arraysMethod;
import java.util.Arrays;
public class sortingArrays {
    public static void main(String[] args) {
        String [] arr = {"z","a","5e","$3"};
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
}
