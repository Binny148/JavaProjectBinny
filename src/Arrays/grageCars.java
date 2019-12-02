package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class grageCars {
    public static void main(String[] args) {


      /*
      Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
      [BMW, Mercedes, Toyota]
      */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cars");
        int size = input.nextInt();
        input.nextLine();

        String [] mycars = new String[size];
        for ( int i = 0; i <mycars.length; i++){
            System.out.println("Enter car" + (i+1));  // to show car one
            String car = input.nextLine();
            mycars[i] = car;
        }

        System.out.println(Arrays.toString(mycars));
    }
}
