package ir.mftvanak.lib.firstOfAzar;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TestIfClass {

    public static void main(String[] args) {

//        firstIfCondition();
//        secondIfCondition();

        thirdIfCondition();
    }

    private static void firstIfCondition() {
        int myAge = 50;
        int yourAge = 20;
        if (myAge > yourAge) {
            System.out.print("Pouya is older than students, and his age is :" + myAge + " and my student's age is :" + yourAge);
        }
    }


    public static void secondIfCondition() {

        if (2 > 3) {
            System.out.print("2 is greater than 3");
        } else {
            System.out.print("3 is greater than 2");
        }
    }


    public static void thirdIfCondition() {
        if (2 > 3) {
            System.out.print("2 is greater than 3");
        } else if (2 == 3) {
            System.out.print("2 is equals to 3");
        } else {
            System.out.print("I dont know");
        }


        if (3 > 2)
            System.out.print("asd");
    }

}
