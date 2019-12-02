package Loop;
import java.util.Scanner;
public class reverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word");
        String word = input.nextLine();
        String reverse = "";
        for ( int i = word.length()-1; i>=0; i--){
            reverse = reverse+word.charAt(i);
        }
        if (reverse.equals(word)){
            System.out.println("It is a Palindrome ");
        }else{
            System.out.println(" It is Not a Palindrome ");
        }
    }
}
