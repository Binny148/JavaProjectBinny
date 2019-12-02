package classes;

public class Book {
    String title;
    String author;
    int pages;


    public Book(){

    }

    public Book(String title, String author, int pages){
        this.title = title;
        this.author= author;
        this.pages= pages;


    }
    public void info(){
        System.out.println("name " + this.title) ;
        System.out.println("Author " + this.author);
        System.out.println("pages " + this.pages);
        System.out.println();// print new line

    }

}
