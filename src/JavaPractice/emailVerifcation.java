package JavaPractice;

import java.util.Scanner;

public class emailVerifcation {
    public static void main(String[] args) {

                System.out.println("Please enter your email here please:");
                Scanner scanner = new Scanner(System.in);
                String n1 = scanner.nextLine();

                int upperCounter = 0;
                int lowerCounter = 0;
                int specialCounter = 0;
                int digitCounter = 0;

                if(n1.length()>=8){
                    char a = '0';
                    for ( int i = 0 ; i<n1.length(); i++){

                        a= n1.charAt(i);
                        if(a>='A' && a<='Z'){
                            upperCounter++;
                        }
                        if(a>='a' && a<='z'){
                            lowerCounter++;
                        }
                        if(a>='!' && a<='.'){
                            specialCounter++;
                        }
                        if( a<='0' && a>='9'){
                            digitCounter++;
                        }
                    }
                    if(upperCounter==0){
                        System.out.println("Password should contain at least 1 uppercase number ");
                    }else if(lowerCounter == 0){
                        System.out.println("Password should contain at least 1 lowercase number  ");
                    }else if(specialCounter== 0){
                        System.out.println(" Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]:;”’?/< ");
                    }else if(digitCounter==0){
                        System.out.println("Password should contain at least 1 digit ");
                    }else{
                        System.out.println("your password is accepted");
                    }
                }else{
                    System.out.println("Password should contain minimum 8 characters ");
                }


        }

}
