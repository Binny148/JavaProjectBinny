package classes;
import java.util.Scanner;
public class ItemShop {
    public static void main(String[] args) {

       /*
       Create a program that will ask user to enter how many items they have.
       Ask from the user to enter all the names and prices of each item.
       Make an Item array that will hold all the items.
       After you have the array loop through it and print the information of all the items
       */
        Scanner input = new Scanner(System.in);
        System.out.println("How many items do you have?");
        int numOfItems = input.nextInt();
        input.nextLine();

        Item[] myItems = new Item[numOfItems];


        for (int i = 0; i < myItems.length; i++) {

            System.out.println("Enter the name of item " + (i + 1));
            String item = input.nextLine();

            System.out.println("Enter the price of item" + (i + 1));
            double price = input.nextDouble();
            input.nextLine();

            myItems[i] = new Item(item, price);

        }

        for (Item item : myItems) {
            item.info();
        }
    }
}
