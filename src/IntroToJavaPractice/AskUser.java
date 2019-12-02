package IntroToJavaPractice;


import java.util.Scanner;


public class AskUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int one = input.nextInt();
        int two = input.nextInt();

        int count = 0;

        one += two;
        count++;

        System.out.println(" Your name is: " +  one + " after incremented by " + two  + "   " + count + " times");

        one += two;
        count++;

        System.out.println(" Your name is" + one +  " after incremented by " + two +  "  " + count +  "times") ;

        one += two;

        count++;

        System.out.println(" Your name is " + one +  " after incremented by " + two + "  " + count  + " times");

        one += two;

        count++;


    }
}
