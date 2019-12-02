package classes;

public class Car {

        String make ;
        int year;
        int mileage;
        boolean sportEdition;

        public void drive(){
            System.out.println(year + " " + make + "is driving.");
            mileage += 10;

        }
        public void drive(String destination){
            System.out.println(this.year + " " + this.make + " is driving to " + destination);
            this.mileage += 10;

        }
        public void drive( int mile){
            System.out.println(this.year + " " + this.make + " is driving to " + mile + " miles ");
            mile+= mileage;
        }

}
