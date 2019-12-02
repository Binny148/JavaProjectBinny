package ifElseStatements;
import java.util.Scanner;

public class passCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter pass code");

        int passCode = input.nextInt();

        if( passCode == 3241 ) {

            System.out.println(" Welcome to iphone");

            }
            else {

            System.out.println(" Try again");
        }
    }
}
