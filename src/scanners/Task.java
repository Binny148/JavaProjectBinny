package scanners;

import java.util.Scanner;
//import newClass.myClass;

public class Task {

    public static void main(String[] args) {

       //myClass myc=new myClass();

        Scanner scanner = new Scanner(System.in);
       /* System.out.println(" Month:");
        int month = scanner.nextInt();
        System.out.println("Day:");
        int day = scanner.nextInt();
        System.out.println("Year:");
        int year = scanner.nextInt();


        String result = "" + month + "/" + day + "/" + year;
        System.out.println(result);

        year += 5;
        day -= 1;

        String result2 = "" + month + "/" + day + "/" + year;

        System.out.println(result2);*/
       String firstName = "";
       String lastName = "";
       System.out.println("What is your first name");
       firstName = scanner.nextLine();
       //System.out.println(firstName+ " My first name is ");
       System.out.println(firstName + "What is your last name");
       lastName = scanner.nextLine();
       System.out.println("My last name is "+lastName);


    }
}
