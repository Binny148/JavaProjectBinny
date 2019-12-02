package Loop;

public class PyramidShape {
    public static void main(String[] args) {

       // for ( int i = 0; i< 8; i++){  // for i value

        //    for ( int j = 0; j < 8 - i ; j++) // finding the space for j value

         //       System.out.println(" ");

         //   for ( int k = 0; k < (2 * i+1); k++ )

           //     System.out.print(" * ");
           //     System.out.println();





        for ( int i = 0 ; i < 8 ; i++) {

            for (int j = 0; j < 8 - i; j++)

                System.out.print(" ");

            for (int k = 0; k < (2*i+1); k++)
                System.out.print("*");
               System.out.println();


        }
        for ( int i = 7; i>= 0 ; i-- ){

            for ( int j = 0; j < 8 - i ; j++)
                System.out.print(" ");
            for( int k = 0 ; k < ( 2 * i +1); k++)
                System.out.print("*");
                System.out.println();





        }
    }
}
