package switchStatements;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        randomNumber++; // this is how I get the range to be 1-10
        System.out.println(" Guess a  number");
        int  guessNumber = input.nextInt();
        System.out.println("The random number is:" + randomNumber);
        if( randomNumber == guessNumber){
            System.out.println("Good guess");
        }else if ( guessNumber < 1 || guessNumber > 10 ){
            System.out.println("Not a valid guess");
        } else if ( guessNumber > randomNumber){
            System.out.println(" Too High");
        } else if (guessNumber < randomNumber){
            System.out.println("Too low");
        }
    }
}
