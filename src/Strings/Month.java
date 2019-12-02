package Strings;
import java.util.Scanner;

public class Month {

    // this task is  for asking which month

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = "october";
        System.out.println("Enter the month");
        String user = input.nextLine();
        boolean check = user.equalsIgnoreCase(month);
        System.out.println(check);
    }
}
