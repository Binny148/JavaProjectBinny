package practiceJava;
import java.util.Scanner;
public class javaTaskWeek2 {
    public static void main(String[] args) {

        /*
        Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to continue) and at the end it should display the count of positive, negative and zeros entered. (Hint: use do while loop)

	Example:

        Input:
	Enter the number: 9
	Do you want to continue y/n? y
	Enter the number: -5
	Do you want to continue y/n? y
	Enter the number: 0
	Do you want to continue y/n? y
	Enter the number: 66
	Do you want to continue y/n? n

        Output:
	Positive numbers: 2
	Negative numbers: 1
	Zero numbers: 1
        */


        Scanner input = new Scanner(System.in);
        String word;
        int negative = 0, postive=0, zeros=0;

        do{
            System.out.println("Please Enter the Number:");
            int num = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
            word = input.nextLine();
            if(num>0){
                postive++;
            }else if(num==0){
                zeros++;
            }else{
                negative++;
            }
        } while( word.equals("y"));
        System.out.println("Postive numbers:=" + postive + " Negative Numbers:=" + negative + " Zero Numbers= " + zeros);
    }

}
