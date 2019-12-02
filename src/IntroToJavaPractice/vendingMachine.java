package IntroToJavaPractice;
import java.util.Scanner;

public class vendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your change ");

        int change , remain, quarters, dimes ,nickels, pennies;


        change = input.nextInt();// age 68
        remain = change;

        quarters = change/25; // -----> quarter --2
        remain = remain%25;  // ---> 68-50=18

        dimes = remain/10; //  18/10=1
        int remain2 = remain%10; // 8

        nickels =  remain2/5;  // 8/5=1
        int remain3 = remain%5; // 3

        pennies =  remain3;

        System.out.println( " Your change of " + change + " was converted to");
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies" + pennies);





    }
}
