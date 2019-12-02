package JavaPractice;
import java.util.Arrays;
public class helloWord {
    public static void main(String[] args) {

      //helloWord();
      printOddNumbers();

    }
    public static void helloWord( ){
        for ( int i = 0; i < 7;  i++){
            System.out.println(i);
        }
    }
    public static void printOddNumbers (){
        for( int i = 0 ; i<30; i++){
            if ( i%2==1){
                System.out.println(i);
            }
        }
    }
}
