package switchStatements;
import java.util.Scanner;
public class Babies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" enter number of babies");

        int numberOfBabies = input.nextInt();
        switch ( numberOfBabies){
                case 0:
                System.out.println("Sorry");
                break;
            case 1:
                System.out.println(" Good for you ");
                break;
                case 2:
                    System.out.println(" wow. Twins!");
                    break;
            case 3:
                System.out.println("WoW. Triplets!");
                break;
            case 4:
            case 5:
            case 6:

                System.out.println("Unbelievble:" + numberOfBabies + " babies!");

            default:
                System.out.println(" I don't believe you");


        }
    }
}
