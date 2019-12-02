package Strings;
import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {

        // Compare the String lexicographically

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two String");
        String word1 = input.nextLine();
        String word2 = input.nextLine();

        int compare = word1.compareTo(word2);

        if(compare <  0){
            System.out.println(word1);
        } else if (compare > 0){
            System.out.println(word2);
        }else{
            System.out.println("Equal");
        }




    }
}
