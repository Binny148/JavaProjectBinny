package ifElseStatements;
import java.util.Scanner;
public class BodyMassTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your mass in Kilogram ");
        double mass = input.nextDouble();
        System.out.println(" Enter your hight in meter");
        double hight = input.nextDouble();

        double bim = mass / (hight * hight);

        if (bim < 18) {
            System.out.println("Underwight");

        } else if (bim <= 18.5 && bim > 25) {
            System.out.println(" Normal weight");
        } else if (bim >= 25 && bim < 30) {
            System.out.println("Over weight");
        } else {
                System.out.println("obses");

        }
    }
}




