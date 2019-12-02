package IntroToJavaPractice;
import java.util.Scanner;

public class math {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println(" Addition result :" + (a+b));
        System.out.println(" Subtraction result:" + (a-b));
        System.out.println(" Division result:"  + ( a/b));
        System.out.println(" Multiplication result:"  + (a*b));

        System.out.println(" Reminder result :"  + (a%b));
    }
}
