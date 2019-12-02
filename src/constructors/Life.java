package constructors;
import java.util.Scanner;
public class Life {
    public static void main(String[] args) {

        /*
        Part I 
      Create a class House 
      Instance variables: type, address, numRooms
      Methods:
      info: this method should simply print details of house.
      Part II
       Create a program that asks from user details of the house through console and create object from House. And print the details of created House.
       Collapse
        */

        House myHouse = new House();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter house type:");
        myHouse.type= scanner.nextLine();
        System.out.println("Please enter house addess");
        myHouse.address= scanner.nextLine();
        System.out.println("Please enter number of rooms");
        myHouse.numRooms = scanner.nextInt();

    }
}
