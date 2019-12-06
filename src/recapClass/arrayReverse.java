package recapClass;

public class arrayReverse {
    public static void main(String[] args) {
        // 1- Create a String
        String word = "We went to picnic today";
        String reverseWord= "";
        for( int i=word.length ()-1; i>=0; i--){
            reverseWord+= word.charAt(i);
        }
        System.out.println("ReverseWord is : " + reverseWord);
    }
}
