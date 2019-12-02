package nestedLoop;

public class WhileLoop {
    public static void main(String[] args) {
        for( int i =0; i <5; i++){
            int run=3;
            while(run!=0){
                System.out.println(run--);
            }
            System.out.println();  // this line is for space
        }
    }
}
