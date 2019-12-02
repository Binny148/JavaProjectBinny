package methods;

public class calculatorOpeartions {
    public static void main(String[] args) {
        System.out.println(calculator("*",10,12));
        /*
        Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)  and two numbers.
        Perform that operation between the two numbers and return the result
        */
    }
    public static double calculator (String  op,double one , double two){
        switch(op){
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "*":
                return one * two;
            case "/":
                return one / two;
            case "%":
                return one % two;
            default:
                System.out.println("invalid operator");
                return 0;
        }
    }
}
