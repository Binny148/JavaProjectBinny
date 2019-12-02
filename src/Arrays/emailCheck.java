package Arrays;

public class emailCheck {
    public static void main(String[] args) {
        /*
        Given a Strings of "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", “Fran2113gmailcom", “JamieM@yahoo.com"
        Print all the emails that are valid. A valid email has the ‘@‘ sign that comes before the ‘.’
        */
    String [] emails = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com"};

    for ( int i = 0; i < emails.length; i++){

        if (emails[i].contains("@") && emails[i].contains(".")){
            int at = emails[i].indexOf("@");
            int dot = emails[i].indexOf(".");

            if( at < dot){
                System.out.println("Valid");

            }else {
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }
    }

    }
}
