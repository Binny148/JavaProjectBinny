package methods;

public class palindromeWord {
    /*
     Create a method for logging in. User passes the username and password as parameters.
      If the passed values are the same as the given username and password return true,
      but if either the username or password is invalid return false
     Username: james123
     Password: password
    */

    public static void main(String[] args) {
        System.out.println(isPalindromeRev( "something"));
    }
    public static boolean isPalindromeRev(String str){
        if ( reverse.reverseString(str).equals(str)){
            return true;
        }else{
            return false;
        }

    }
}
