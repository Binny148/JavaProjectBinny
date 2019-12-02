package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class storeNamesIntoArray {
    public static void main(String[] args) {

       // Write a program that will ask user to enter 5 names.
        // Take each name and store all the names into an array. Print the array

        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want to enter");
        int size = input.nextInt();
        input.nextLine();
        String [] names = new String[size];
        for ( int i = 0; i < names.length; i++){
            System.out.println("Enter name" + (i+1)); //  add 1 to i
            names[i] =  input.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
