package practiceJava;

public class grade {
    public static void main(String[] args) {
        int score = 33;
        if ( score >90 && score <=100){
            System.out.println(" Student got " + " A");
        }else if ( score >=80 && score <90){
            System.out.println("student got " + " B" );
        }else if (score >=70 && score <80){
            System.out.println("Student got " +  " C");
        }else if ( score >=60 && score <70){
            System.out.println("Student got " + " C");
        }else if (score >=50 && score <60){
            System.out.println("Student got " + "D");
        }else {
            System.out.println("Student failed this course! ");
        }
    }
}
