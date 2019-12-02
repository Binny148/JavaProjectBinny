package classes;
import java.util.Scanner;
public class library {
    public static void main(String[] args) {
        /*
     Create a method for logging in. User passes the username and password as parameters.
      If the passed values are the same as the given username and password return true,
      but if either the username or password is invalid return false
     Username: james123
     Password: password
    */
        Scanner input = new Scanner(System.in);
        System.out.println("How many books do you have");
        int numOfBooks = input.nextInt();
        input.nextLine();
        Book [] library = new Book[numOfBooks];
        for(int i=0; i < library.length; i++) {

            System.out.println("Enter the title of book " + (i+1));
            String title = input.nextLine();
            System.out.println("Enter the author of book " + (i+1));
            String author = input.nextLine();
            System.out.println("Enter the number of pages of book " + (i+1));
            int pages = input.nextInt();
            input.nextLine();
//            Book eachBook = new Book(title,author,pages);
//            library[i] = eachBook;
            library[i] = new Book(title,author,pages);
        }
        for(Book book: library) {
            System.out.println(book.title);
        }


    }
}
