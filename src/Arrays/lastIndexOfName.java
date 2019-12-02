package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class lastIndexOfName {
    public static void main(String[] args) {

        String [] students = { "James" , " Sam" , " Adam" , " Elize" , " Benzema" , "Sandy"};

        for ( int i = 0; i < students.length; i++){
            int last = students[i].length()-1;
            System.out.println(students[i].charAt(last)); // finding last index for students
        }
        System.out.println(); // will make space fro the results
        for ( int i = 0 ; i < students.length ; i++) {


            if (students[i].toLowerCase().endsWith("s")) {
                System.out.println(students[i]);
            }
        }
        System.out.println();
        System.out.println("Enter a String");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        for (int i = 0 ; i < students.length; i++){
            if (students[i].toLowerCase().contains(user)){
                System.out.println(students[i]);
            }
        }
    }
}
