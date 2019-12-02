package Strings;
import java.util.Scanner;
public class CoolName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your name");
        String name = input.nextLine().toLowerCase();
        if (name.charAt(0) == 'a' || name.charAt(0) == 'z') {
            System.out.println("Cool name");
        } else {
            System.out.println("not cool");

            // other option to solve this
        }

        if (name.substring(0, 1).equalsIgnoreCase("a") || name.substring(0, 1).toLowerCase().equals("z")) {
            System.out.println("cool");
        } else {
            System.out.println("not cool");
        }
    }
}
