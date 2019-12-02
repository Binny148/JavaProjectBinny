package SwitchStatement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please eneter  numbers one ");

        double num1 = input.nextDouble();
        System.out.println(" Plsease enetr number two");
        double num2 = input.nextDouble();

        input.nextLine(); // for next line

        System.out.println(" Enter the operator ");
        String op = input.nextLine();
        double result = 0;
        boolean valid = true;

        switch ( op){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;

            default :
                System.out.println(" Invalid operator");
                valid = false ;

        }
        if(valid==true) {
            System.out.println(num1+" " + op + " "+num2 + " = " + result);
        }
    }
}
