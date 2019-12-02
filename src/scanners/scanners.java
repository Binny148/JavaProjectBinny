package scanners;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

import java.util.Scanner;

public class scanners {

    public static void main(String[] args) {

        // String name = "James";
        // String lastName = "Bond";

        //int age = 45;

        //String location = " London, UK";

        // boolean isHeOk = true;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("Welcome," + name + "!");
        System.out.println("Where are you from ," + name + "?");
        String city = input.nextLine();
        System.out.println("You are from " + city + ", " + "  Have old are you?");


        int age = input.nextInt();

        System.out.println("You are " + age + " years old");


    }
}
