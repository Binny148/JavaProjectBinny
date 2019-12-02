package doWhile;
import java.util.Scanner;
public class printLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter = input.nextLine().toUpperCase().trim().charAt(0); // next line change to all upper case and
        // delete the space and use the first letter

        if( letter >= 65 && letter <= 90){
            while ( letter !=90){
                System.out.println(letter++);
            }
        }else{
            System.out.println("Not a valid letter");
        }
    }
}
