package arraysMethod;

public class biggestWord {
    public static void main(String[] args) {
        String str = " Write a program that creates a group of given size thisisabigword";
        String [] arr = str.trim().split( " ");

        int biggestLength = 0;

        for( String word : arr){
            if ( word.length() > biggestLength){
                biggestLength = word.length();
            }
        }

     for ( String word: arr) {
         if(word.length() == biggestLength){
             System.out.println(word);
         }
       }
    }
}
