package WhileLoop;
import java.util.Scanner;
public class askUserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number above 0");
        int num = input.nextInt();
        int start = 0;
        while ( start <= num ){
            System.out.println(start++);


        }
    }
}
