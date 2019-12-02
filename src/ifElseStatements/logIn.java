package ifElseStatements;
import java.util.Scanner;
public class logIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username = "binny1";
        String password = "binnyjohn123";

        System.out.println(" Please enter your username:");
        String enterUsername = input.nextLine();

        if(enterUsername.equals( username)){
            System.out.println("Please enter your password:");
            String enterdPassword = input.nextLine();
            if(enterdPassword.equals(password)){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Invalid password");
            }
        }
        else{
            System.out.println("Invalid username. try again");
        }
    }
}
