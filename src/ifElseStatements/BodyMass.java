package ifElseStatements;
import java.util.Scanner;
public class BodyMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your mass in Kilogram");
        double mass = input.nextDouble();
        System.out.println(" enter your height in meters");
        double height = input.nextDouble();

        double BMI = mass/ ( height * height);

        if (BMI < 18.5) {
            System.out.println(" underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println(" Normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("over weight");
        } else {
            System.out.println(" obese");


        }
    }
}
