package switchStatements;
import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade = input.nextLine().charAt(0);

        switch ( grade){
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Great");
            case 'c':
                System.out.println("okay");

            case 'd':
                System.out.println("you can do better");
            case 'f':
                System.out.println("Something need to change");
                break;
            default:
                System.out.println(" Not valid grade");
        }



    }
}
