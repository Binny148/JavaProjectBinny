package IntroToJavaPractice;

import java.util.Scanner;


public class booleans {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int one = input.nextInt();

        int two = input.nextInt();

        boolean  b = one>two;

        System.out.println(b);

        boolean check = input.nextBoolean();

        System.out.println(!check);





    }



}
