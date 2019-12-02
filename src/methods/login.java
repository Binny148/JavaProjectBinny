package methods;

public class login {
    public static void main(String[] args) {

        /*
     Create a method for logging in. User passes the username and password as parameters.
      If the passed values are the same as the given username and password return true,
      but if either the username or password is invalid return false
     Username: james123
     Password: password
    */

        System.out.println(loginMethod( "james123", "password"));

    }
    public static boolean loginMethod (String username , String password ){

        String validUserName = "james123";
        String validPassword = "password";

        if ( validUserName.equals(username) && validPassword.equals(password)){
            return true ;
        } else {
            return false ;
        }
    }
}
