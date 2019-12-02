package JavaPractice;
import java.util.Arrays;
import java.util.Scanner;
public class stringWord {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [] word = {"hello", "why", "by", "apple", "note"};

        for ( int i =0; i<word.length; i++){
            word[i]=word[i].substring(0,2)+word[i].substring(word[i].length()-1);
        }
        System.out.println(Arrays.toString(word));
    }
}
