package Loop;
import java.util.Scanner;
public class notPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word  = input.nextLine().toLowerCase();
        String reverse = "";
        for ( int i = word.length()-1; i>=0; i--){
            reverse = reverse+word.charAt(i);
        }if (reverse.equals(word)){
            System.out.println("Plandrome");
        }else{
            System.out.println("Not Plandrome");
        }

    }
}
