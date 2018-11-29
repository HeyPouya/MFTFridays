package ir.mftvanak.lib.twentyFifthOfAbabn;

/*
this is a class to demonstrate variables
 */
public class LearningFuncAndVars {


    public static void main(String[] args) {
//        printAge();

        String name = getName();

        int myAge = getAge(1980, 2018);

        System.out.print(name);
        System.out.print(myAge);

    }

    // these are numeric variables
    static int number = 20;
    static long secondNumber = 30;
    static short thirdNumber = 40;
    static float fourthNumber = 12.25f;
    static double fifthNumber = 12.25;

    // these are boolean variables
    static boolean firstBool = true;
    static boolean secondBool = false;

    //these are string variables
    static String name = "Pouya";
    static char c = 'c';


    /**
     * calculates age
     */
    static void printAge() {
        System.out.println("Your age is 50");
        System.out.print("But mine isn't 50");
    }

    static String getName() {
        number = 10;
        number = 10;
        number = 10;
        number = 10;
        number = 10;
        number = 10;
        number = 10;
        return "Pouya";
    }

    static int getAge(int birthYear, int thisYear) {

        int age = thisYear - birthYear;
        return age;
    }

}
