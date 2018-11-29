package ir.mftvanak.lib.secondOfAzar;

public class ParentClass {

    static private void printName() {
        System.out.println("Pouya");
    }


    static public void printAge() {

        TestImplementationOfInterface t = new TestImplementationOfInterface();
        t.printName();
    }

    static protected void printFamily() {

    }
}
