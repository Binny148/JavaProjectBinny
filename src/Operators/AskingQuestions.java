
package Operators;

import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String name ;
        char  gender ;

        int age ;
        long phoneNum ;

        double  gpa ;



        System.out.println(" your given name is: ") ;

        name = input.nextLine();

        System.out.println(" what is your gender is ");

        gender = input.nextLine().charAt(0);

        System.out.println("your age is " );

        age = input.nextInt();



        System.out.println(" your phone number is" );

        phoneNum = input.nextLong();

        System.out.println(" your age is");

        age = input.nextInt();

        System.out.println(" ");



        System.out.println();










    }
}
