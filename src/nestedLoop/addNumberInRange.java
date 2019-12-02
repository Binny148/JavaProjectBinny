package nestedLoop;
import java.util.Scanner;
public class addNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int sum = 0;

        for ( int i = numOne; i<=numTwo; i++){
            sum += i; // adding i
        }
        System.out.println("The sum of " + numOne + " to " + numTwo + " is " + sum);
    }
}
