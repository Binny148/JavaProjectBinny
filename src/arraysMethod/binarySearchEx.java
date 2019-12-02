package arraysMethod;
import java.util.Arrays;
public class binarySearchEx {
    public static void main(String[] args) {
        int [] nums = { 2,5,7,14};
        System.out.println(" Index of 1 is: " +Arrays.binarySearch(nums,1)); // 1 is not in nums
        System.out.println(" Index of 2 is: " +Arrays.binarySearch(nums,2)); // 2 1st index
        System.out.println(" Index of 7 is: " +Arrays.binarySearch(nums,7));
        System.out.println(" Index of 9 is: " +Arrays.binarySearch(nums,9));
        System.out.println(" Index of 15 is: " +Arrays.binarySearch(nums,15));
        System.out.println(" Index of is: " +Arrays.binarySearch(nums,50));
    }
}
