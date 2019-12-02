package SwitchStatement;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Random;

public class AskUserAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = input.nextInt();
        {

            if (age < 0 || age > 100) {
                System.out.println("Not a valid age");
            } else if (age >= 30) {
                System.out.println("Welcome to the building ");

            } else {
                System.out.println("Try again when you are 30");
            }
        }
    }
}


