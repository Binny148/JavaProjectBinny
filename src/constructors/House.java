package constructors;

public class House {

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


    String type;
    String address;
    int numRooms;
    public void info(){
        System.out.println("\nType: " + this.type);
        System.out.println("Adress: " + this.address);
        System.out.println("Number of rooms: " + this.numRooms);
    }
}
