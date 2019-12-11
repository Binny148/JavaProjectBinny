package enumEx;

public enum DaysInWeek {
    MONDAY,FRIDAY,SATURDAY,SUNDAY;
    /*
    Make an Enum for all the days in a week.
    Then write a method that will accept what day it is and print some message.
If it is Monday print “Mondays are bad”
If it is Friday print “Fridays are great”
If it is Saturday or Sunday print “Weekends are the best”
If it is any other day print “Regular day”

    */


    public static void main(String[] args) {
        checkDay(DaysInTheWeek.Monday);
    }

    public static void checkDay(DaysInWeek day){
        switch(day){
            case MONDAY:
                System.out.println("Monday are bad");
                break;
            case FRIDAY:
                System.out.println("Friday are better");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("weekends are the best");
                break;
            default :
                System.out.println("Regular day are okay");
        }

    }
}
