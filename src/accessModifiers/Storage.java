package accessModifiers;
import java.util.Scanner;
public class Storage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Chair chair = new Chair();
        chair.model = "Home Depot";
        chair.size = -12;
        chair.setSize(15);
        chair.info();
        System.out.println(chair.getSize());
        Person person = new Person();
        person.setAge(25);
        System.out.println(person.getAge());
        // Ask user to enter age for Zeynep until user enters
        // valid age.
        //User Scanner;
        do {
            System.out.println("Enter age: ");
            int age = input.nextInt();
            input.nextLine();
            if (age > 0 && age < 120) {
                person.setAge(age);
                break;
            }else {
                System.out.println("Invalid age");
            }
        } while (true);
    }
}

