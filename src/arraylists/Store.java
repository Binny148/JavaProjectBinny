package arraylists;
import classes.Item;
import java.util.Scanner;

import java.util.ArrayList;
public class Store {

    String name;
    String address;
    int numberOfItems;
    double totalSales;

   ArrayList<Item> item = new ArrayList<>();

    public  Store(String name , String address){
        this.name= name;
        this.address= address;

    }
    public void addItem(Item item){

        this.item.add(item);
        this.numberOfItems++;


    }
    public void addItem(){
        /*
        overload the method addItem. Method doesn't take anything. This method should ask user how many items to enter
        Method should ask Item name and price and add the Item to the items list based on the quantity user entered.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items to enter ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        for( int i=0; i<quantity;i++){
            System.out.println("Enter name for item#" + (i+1));
            String name =  scanner.nextLine();
            System.out.println("Enter price for items#" + (i+1));
            double price = scanner.nextDouble();
            scanner.nextLine();
            Item item = new Item(name, price);
            this.item.add(item);
            this.numberOfItems++;

        }

    }
    /*
    Creat method sellItem. Method accepts name of the Item and doesn't return anything. Check if the name of the item is in the list.
    If it's in stock remove from the list and add the price to totalSales and give sucess transaction message. If doesn't exist in the
    list give failed transaction message and terminate the method.
    */
    public void sellItem(String itemName){
         for ( int i =0; i<item.size(); i++){
    if(item.get(i).name.equals(itemName)){
        this.totalSales += item.get(i).price;
        item.remove(i);
        System.out.println("Sucessful transaction ! Thank you ");
        this.numberOfItems--;
        return;

            }
          }
        System.out.println("Item is not in stock");


    }
    public void returnItem(String itemName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price  of the returned item here");
        double itemPrice = scanner.nextDouble();
        Item items = new Item(itemName, itemPrice);
        item.add(items);
        this.totalSales-= itemPrice;
        this.numberOfItems++;
        System.out.println("\nReturn process successful");




    }

    public void seeInventory(){
        System.out.println("\nZara Chicago Store");
        System.out.println("Total sales: " + this.totalSales + "$");
        for( Item item: item){
            item.info();
        }

    }

}
