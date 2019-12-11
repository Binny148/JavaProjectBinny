package enumEx;

public class UsingEnum {

    public static void main(String[] args) {
        LetterGrade grade = LetterGrade.A;
        //grade = LetterGrade.B;


        switch (grade){
            case A:
                System.out.println("You got an A");
                break;
            case B:
                System.out.println("Not Bad");
                break;
            case C:
                System.out.println("you could do better");
                break;
            case D:
                System.out.println("Not so good");
                break;
            case F:
                System.out.println("you failed");
                break;
        }
      }
   }


