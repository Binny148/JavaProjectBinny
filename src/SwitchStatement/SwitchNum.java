package SwitchStatement;
import java.util.Scanner;
public class SwitchNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        switch(name){
            case "Binny":
                System.out.println(" Welcome Binny");
                break;

              case "Merry":
            System.out.println("Go away");
            break;

            default:
                System.out.println("Wrong input , Please Try again!");
                break;
        }

    }
}
