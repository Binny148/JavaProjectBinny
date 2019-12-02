package javaPresentation;

public class logInMethod {
    public static void main(String[] args) {
        /*

      Create a method for logging in. User passes the username and password as parameters.
      If the passed values are the same as the given username and password return true,
      but if either the username or password is invalid return false
      Username: binny10
      Password: binny123
    */
        System.out.println(logIn("BinnyJ","Binny@John"));

    }
    public static boolean logIn(String username, String password){
        String validUsername = "BinnyJ";
        String validPassword= "Binny@John";

        if ( validUsername.equals(username)&& validPassword.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
