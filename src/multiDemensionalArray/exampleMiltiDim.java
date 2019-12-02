package multiDemensionalArray;
import java.sql.SQLOutput;
import java.util.Arrays;

public class exampleMiltiDim {
    public static void main(String[] args) {
        int [][] groups = new int [3][4];

        //int [] num = {1,2,3,4,5};
        //groups[1] = num;
        //System.out.println(Arrays.deepToString(groups));

        String [][] str = new String [4][4];
        System.out.println(Arrays.deepToString(str));
        System.out.println(Arrays.deepToString(groups));

    }
}
