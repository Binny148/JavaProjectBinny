package staticClass;

public class BestBuy {

    String location;
    static int numOfComputers;
    static String day;

      static {
          numOfComputers = 50;
          System.out.println("run first");
          day="Monday";
      }

      static{
          numOfComputers=100;
      }
    public static void printComputer(){
        System.out.println(numOfComputers);
    }

}
