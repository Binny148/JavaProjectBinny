package classes;

import java.util.ArrayList;

public class Item {
    /*
    Create a class Item that has instance variables name and price.
    Create a constructor that sets both the name and the price.
    Create a method that will print the name of the item and the price.

    */
    public String name;
    public double price;
    int size;


    public Item(String name, double price) {
        this.name = name;
        this.price = price;


    }
    // Overload the constructor that takes 3 paramters to set all 3 instance variables
    public Item( String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
    // we can call constructor inside another constructor .
    // It is called constructor chaining.
    // we can do it using keyword 'this' with the parenthesis .



    public void info() {
        System.out.println("\nName: " + name);
        System.out.println("Price: " + price);

    }

}
