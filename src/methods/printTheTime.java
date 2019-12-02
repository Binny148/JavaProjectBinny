package methods;

public class printTheTime {
    public static void main(String[] args) {
        printTheTime(10,50, 23 ,true);

    }
    public static void printTheTime(int hour, int minute,int second, boolean amOrPM){
        if((hour > 0 && hour < 13) && (minute >=0 && minute < 60) && (second >=0 && second<60)){
            String date = hour + " : "  + minute + " : " + second ;

            if( amOrPM){
                date += " AM ";
            }else {
                date += " PM ";
            }
            System.out.println(date);
        }else {
            System.out.println("Invalid date");
        }
    }
}
