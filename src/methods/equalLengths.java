package methods;

public class equalLengths {
    /*
    Create a method that accepts String and int.
    Check if string length is same as given integer.
    Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
    */

    public static void main(String[] args) {
       equalLengths("names", 3) ;
    }
    public static void equalLengths(String str, int len){
        if( str.length() == len){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
