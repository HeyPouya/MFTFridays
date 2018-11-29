package ir.mftvanak.lib.firstOfAzar;

public class TestForClass {


    public static void main(String[] args) {

//        int a = 10;
//
//        for (int b = 1; b < a; b = b * 2) {
//            System.out.println("The value of b is: " + b);
//        }


        ///////////////////////


//        int b = 5;
//        int c = 1;
//
//        for (int i = 1; i <= b; i++) {
//            c = c * i;
//        }
//        System.out.print("result is : " + c);


        int b = 5;
        int c = 1;
        for (int i = b; i > 0; i--) {
            c = i * c;
        }
        System.out.print("result is " + c);


    }
}
