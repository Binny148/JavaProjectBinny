package JavaPractice;

import java.util.Scanner;

public class areaRectangel {
    /*
    Find area of the Rectangle
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle here ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the Rectangle");
        double width = input.nextDouble();
        //Area = length *  width
        double area = length * width;
        System.out.println("Area of the rectangle is: " + area );


    }
}
