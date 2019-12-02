package methods;

public class palindromInArrays {
    /*
    Create a method that will take a String as a parameter and return if the String is palindrome or not
    */
    public static void main(String[] args) {
        System.out.println(isPalindromeArr("something"));

    }
    public static boolean isPalindromeArr(String str){
        char [] arr = str.toLowerCase().toCharArray();

        for (int i=0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
