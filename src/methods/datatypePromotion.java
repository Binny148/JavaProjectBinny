package methods;

public class datatypePromotion {
    /*
    Overloading example 
    */
    public static void main(String[] args) {
        int a =45;
        calc(a);
    }
    public static void calc(int i){
        System.out.println("using int");
    }
    public static void calc(long l){
        System.out.println("using long");
    }
    public static void calc(float f){
        System.out.println("using float");
    }
}
