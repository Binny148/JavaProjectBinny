package Arrays;
import java.util.Arrays;
public class    addAndMultiplyArrays {
    public static void main(String[] args) {
        /*
        crate arr number 1 to 10 and multiply the result with 19.
        */

        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        for ( int i = 0; i<nums.length; i++){
            nums[i]= nums[i]*19;
            System.out.println(nums[i]);

        }

    }
}
