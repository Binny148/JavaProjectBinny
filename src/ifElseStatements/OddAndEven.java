package ifElseStatements;
import java.sql.SQLOutput;
import java.util.Scanner;
public class OddAndEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Intger number");
        int number = input.nextInt();
        if( number % 2 == 0) {
            System.out.println(" The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
