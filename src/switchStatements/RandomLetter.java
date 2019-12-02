package switchStatements;
import java.util.Random;
public class RandomLetter {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(26);

        System.out.println(" Random num:" + number);
        number += 65;

        char letter = (char) (number);
        System.out.println("My Number is " + number);
        System.out.println("Your letter is " + number);
    }
}
