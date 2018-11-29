package ir.mftvanak.lib.twentyFifthOfAbabn;

public class MainExampleClass {

    // global variable
    static int age = 10;

    /**
     * all java classes starts from main method
     * Java is an structural language
     *
     * @param args
     */
    public static void main(String[] args) {
        printName();


        //just in time variable
        for (int a = 10 ; a<20;a++){

        }
    }

    static void printName() {
        //local variable
        String name = "pouya";
        System.out.print(name);
    }
}
