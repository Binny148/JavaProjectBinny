package JavaPractice;

import java.util.Scanner;

public class taskJavaWeek2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your mixed message here?");
        String word = input.nextLine();
        String str = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
                str += word.charAt(i);
            }
        }
        System.out.println(str);
    }
}


