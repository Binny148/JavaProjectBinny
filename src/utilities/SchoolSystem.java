package utilities;
import java.util.ArrayList;
import java.util.Arrays;
public class SchoolSystem {
    public static void main(String[] args) {
        ArrayList<String> k = MyCollection.getStringList();
        //System.out.println("\n" + k);

        ArrayList<String> list = new ArrayList<>();
        list.add("Json");
        list.add("John");
        list.add("Binny");
        list.add("karina");
        list.add("Adam");
        System.out.println(list + "\n");
        ArrayList<String> K = MyCollection.removeDuplicates(list);
        //ArrayList<String> K = MyCollection.filterList(list, 5);
        System.out.println(k);

        //MyCollection.getStringList()
    }
}
