package JavaPractice;

public class ReverseInteger {
    public static void main(String[] args) {
        /*
        Reverse number of integer
        */

        int num = 123456789;
        int rev = 0;

        while( num !=0 ){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse number is: " + rev);
    }
}
