package arraylists;
import java.util.ArrayList;
public class Speaker {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Jason");
        names.add("Adam");
        names.add(1,"John");
        System.out.println(names);
        System.out.println(names.get(1));


        //How to use List for any objects.

        ArrayList<Cat> catsForSale = new ArrayList<>();

        Cat cat1 = new Cat();
        cat1.color = "White";
        cat1.age= 3;
        catsForSale.add(cat1);

        Cat cat2 = new Cat();
        cat2.color = "Yellow";
        cat2.age = 1;

        catsForSale.add(cat2);

        System.out.println(catsForSale);

        for( int i=0; i<catsForSale.size(); i++){
            System.out.println("Cat#: " + (i+1));
            System.out.println("Color: " + catsForSale.get(i).color);
            System.out.println("Age: " + catsForSale.get(i).age);
            System.out.println();

        }

    }
}
