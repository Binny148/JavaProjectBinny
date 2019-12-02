package IntroToJavaPractice;
import java.util.Scanner;

public class compareChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char a = input.nextLine().charAt(0);
        char b = input.nextLine().charAt(0);

        boolean c = a>b;

        System.out.println(c);

    }
}
