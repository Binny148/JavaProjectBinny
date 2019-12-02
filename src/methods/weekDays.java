package methods;

public class weekDays {
    public static void main(String[] args) {

        /*
        Write a method that will tell you if it is the weekday or not. The method takes a String,
         Saturday and Sunday are the only weekend days

        */
        System.out.println(isweekdays("Sunday"));

    }
    public static boolean isweekdays(String day){
        day = day.toLowerCase();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "wednesday":
            case "Thursday":
            case "Firday":
                return true;
            case "Saturday":
            case "Sunday" :
                return false ;
            default :
                System.out.println("Invalid day provided ");
                return false;
        }
    }
}
