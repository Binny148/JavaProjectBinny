package Strings;
import java.util.Scanner;
public class creatingAnEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first word");

        String name = input.nextLine();

        System.out.println("Please Enter your second word");

        String name2 = input.nextLine();


        if(name.length() < 6 && name2.length()<6){
            System.out.println("Invalid Data");
        }else{
            System.out.println(name.substring(0,4)+ name2.substring(name2.length()-3) + "@cybertek.com");
        }
    }
}
