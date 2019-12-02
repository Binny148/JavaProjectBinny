package JavaPractice;
import java.util.Scanner;
public class select3Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words here please");
        String [] arr = new String [5];
        for ( int i =0 ; i<5; i++){
            arr[i] = input.nextLine();
        }
   for (String arrs:arr){
       System.out.println(arrs.substring(0,3));
        }
    }
}
