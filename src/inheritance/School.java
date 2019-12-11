package inheritance;

public class School {
    /*
    Create a class School. 
instance variables: name, address, type 
 
create a method giveHW. Method doesn’t take anything or return anything.
 Simply print “%schoolName is giving home work”. 
 
Create method hostEvent. Void method and accepts date. This method should print “Hosting an event on %date”. 
2. Create class CodingBootcamp Extend to School.
* Create object from CodingBootcamp class and see what properties and method are offered.
Collapse

    */

    String name ;
    String address;
    String type;


    public  void giveHW(int date){
        System.out.println(this.name);
    }
}
