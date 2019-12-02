package WhileLoop;
import java.util.Scanner;
public class addNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would like to add 1");
        String check = input.nextLine();
        int number = 0;

        while (check.equals("yes") || check.equals("y")) {
            number++;

            System.out.println("Would you like to add 1");
            check = input.nextLine();
        }
        System.out.println(" Your number is :" + number);
    }
}
