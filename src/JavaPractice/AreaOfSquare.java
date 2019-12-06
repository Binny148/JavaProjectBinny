package JavaPractice;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Please inter your side here ");
        double side = input.nextDouble();
        double area = side * side ;
        System.out.println("Area of the Square is : " + area );
    }
}
