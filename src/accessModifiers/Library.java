package accessModifiers;
import classes.Author;
import utilities.MyCollection;
public class Library {
    public static void main(String[] args) {
        Author author = new  Author();
        //author.name = "James";


        //why because access modifiers
        // author object does not have access of variables 'name'.
        // Author class is located in the different package than library class.

        Person person1 = new Person();



    }
}
