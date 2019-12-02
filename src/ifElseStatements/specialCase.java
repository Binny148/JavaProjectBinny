package ifElseStatements;

import java.util.Scanner;


public class specialCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter pass code");
        int userPass = input.nextInt();
        int passCode = 3241;

        if (userPass == passCode) {
            System.out.println(" Welcome to your iphone");
        } else if (userPass < 1000) {
            System.out.println(" You entered less digits");
        } else if (userPass > 9999) {
            System.out.println(" You entered more digits");
        } else {
            System.out.println(" Wrong passCode! Try Again!");
        }


    }
}
