package Strings;
import java.util.Scanner;
public class CarInGarage {
    public static void main(String[] args) {
        String cars = " Toyota, BMW , Juguar , maserati";
        cars = cars.toLowerCase();


        if (cars.isEmpty()) {
            System.out.println("Garage is empty");
        }
        if (cars.contains("toyota") || cars.contains("nissan")) {
            System.out.println("There is a Japanese care in your Garage");
        } else {
            System.out.println("There is no Japanese car in your Garage");
        }

        if (cars.contains("bmw")) {
            System.out.println("There is a Germany car in your Garage");
        } else {
            System.out.println("There is no Germany car in your Garage");
        }
        if (cars.contains("maserati")) {
            System.out.println("There is an Italian can in your Garage");
        } else {
            System.out.println("There is no Italian car in your Garage");
        }
        if (cars.contains("juguar")) {
            System.out.println(" There is a British car in your Garage ");
        } else {
            System.out.println("There is no British car in your Garage");
        }
    }
}