package Strings;
import java.util.Scanner;
public class MoveFirstword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your sentence");
        String sen = input.nextLine();

        int space = sen.indexOf(" ");
        String firstWord = sen.substring(0,space);
        String reamin = sen.substring(space +1);
        System.out.println(reamin + " " + firstWord);

    }
}
