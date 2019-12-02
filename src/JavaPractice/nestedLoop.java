package JavaPractice;

public class nestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j < 10; j++) {
                //System.out.println(i + "|" + j);
                //System.out.println(j);

                System.out.println(j + " Inner Loop");
            }
            // System.out.println(i + "|" + j); -- will complain because j is not in the loop
            System.out.println(i + " Outer Loop");
        }
    }
}
