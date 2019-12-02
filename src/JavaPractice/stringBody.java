package JavaPractice;
import java.util.Scanner;
public class stringBody {
    /*
     input- hello
     output- ohelloo
    */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word here please");
        String  str = input.nextLine();
        int length = str.length();

        System.out.println(str.substring(length-1)+ str + ( str.substring(length-1)));

    }
}
