package Operators;

public class Increment {

    public static void main(String[] args) {


        int age = 5;

        System.out.println(age); // 5
        System.out.println(++age); // 6
        System.out.println(age++); // 6 after> 7
        System.out.println(++age);

        int x = 11;
        int y = x++; // int y = 11; then x increment

        System.out.println("X=" + x);
        System.out.println("y=" + y);
        System.out.println(y);

    }
}
