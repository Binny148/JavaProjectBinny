package Arrays;
import java.util.Arrays;
public class fourColors {
    public static void main(String[] args) {
        String [] colors = { "Red", "Green" , "Oranges", "Blue"};
        for ( int i = 0 ; i< colors.length; i++){
            String color = colors[i];
            if( colors[i].length() >= 4){
                System.out.println(color);
            }
        }
    }
}
