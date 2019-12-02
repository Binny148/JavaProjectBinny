package Strings;
import java.util.Scanner;
public class changeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = " We will have a picknic when the weather gets nicer";
        System.out.println(word);
        System.out.println("what do you want to change");
        String change = input.nextLine();
        System.out.println("what do you want to change");
        String replace = input.nextLine();
        String newWord = word.replace(change, replace);
        System.out.println(newWord);
    }
}
