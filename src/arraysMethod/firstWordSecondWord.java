package arraysMethod;

public class firstWordSecondWord {
    public static void main(String[] args) {

        /*
        Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
       > input: “day”, “name”
       > output: “daynameday”
       Overload the method above to now accept the two Strings and an integer. The integer given tells you how many times your first word should show up in your new String. Your first words need to always be separated by the second word.
       > input: “day”, “name”, 3
       > output: “daynamedaynameday”
       */

        dayName("day","4");


    }
    public static void dayName(String day,String name){
        System.out.println(day+name);
    }
    public static void dayName(String word, String yaya, int num){
        for (int i =0 ; i<num;i++){
            if(i==num-1){ // trying to get to the 3rd word
                System.out.print(word);
            }else{
                System.out.print(word + yaya);
            }
        }
    }
}
