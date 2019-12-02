package Arrays;
import java.util.Arrays;
public class task3CreatArray {
    public static void main(String[] args) {

 /*
     Create and array of integer and store following numbers [5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2]
     Using a nested loop print only values that appear once(true meaning of unique):

     Output: 5 11 55 54 1

 */

            int [] nums = {5, 7, 8, 8 , 11, 55, 23, 23, 23, 23, 54, 7 , 1, 2, 2};

            int count = 0;

            for ( int num: nums) {
                count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (num == nums[i])
                    count++;
                }
                if (count == 1) {
                    System.out.print(num + " ");
                }

            }
    }
}
