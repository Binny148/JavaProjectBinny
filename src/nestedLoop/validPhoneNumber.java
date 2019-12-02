package nestedLoop;
import java.util.Scanner;
public class validPhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        boolean validLength = false;  // by defult i said false
        if(number.length()== 10){
            validLength = true ;
        }else if( number.length()== 12){

            if( number.charAt(0) == '('  &&  number.charAt(4)  == ')'){  // (773)
                validLength = true;
                number = number.replace("(","".replace(")","")); // replacing (312)->312
            }
        }

        //we check the length so far
        //if valid length we will check if all are numbers
        // if invalid length don't check

        int count = 0;
        if(validLength ){

            for ( int i = 0 ; i < number.length(); i++){
                // if ( number)---->store
                char num =  number.charAt(i);

                if ( num>= 48 && num <= 57){  // '1'  '9'
                    count++;
                }
            }

            if ( count == number.length()){
                System.out.println(" Valid number ");
            } else{
                System.out.println("Invalid number");
            }
        }else{
            System.out.println(" Invalid number format");
        }

    }

}
