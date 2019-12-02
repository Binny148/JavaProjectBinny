package Loop;
import java.util.Scanner;

public class askUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your name here please");
        String name = input.nextLine();

        for ( int i = 0; i < 5; i++){
            System.out.println(name + " " + i);
        }
        System.out.println();
        for(int i= 0; i< name.length(); i++){
            System.out.println(name.charAt(i) + " for index: " + 1);

        }
    }
}
