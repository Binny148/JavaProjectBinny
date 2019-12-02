package Strings;
import java.util.Scanner;
public class relatives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();  // "I am x years old"
        int am = str.indexOf("am") + 3;
        int years = str.indexOf("years");
        String age = str.substring(am,years-1);
        int ageNum = Integer.valueOf(age);
        ageNum += 5;
        System.out.println("In 5 years you will be " + ageNum);

    }
}
