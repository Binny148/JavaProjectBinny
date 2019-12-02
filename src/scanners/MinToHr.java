import java.util.Scanner;


public class MinToHr {
    /*
    Write a program that calculates minutes into hours and minutes
    */

    public static void main(String[] args) {

        Scanner input  = new Scanner (System.in);

        System.out.println(" Please enter the Minutes ");

        int mins = input.nextInt();

         int hours = mins/60;
         int remindingMin = mins % 60;


        System.out.println( mins + " Minute is " + hours + " hours and " + remindingMin + " minutes ");


    }
}
