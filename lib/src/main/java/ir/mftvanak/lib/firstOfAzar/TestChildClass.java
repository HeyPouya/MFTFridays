package ir.mftvanak.lib.firstOfAzar;

import ir.mftvanak.lib.secondOfAzar.ParentClass;

public class TestChildClass extends TestParentClass {


    public static void main(String[] args) {

        UtilsClass uc = new UtilsClass();


        int a = uc.sum(10, 20);

        System.out.print("result is " + a);
//        printName();
//        printYourName();

        ParentClass p = new ParentClass();

//        p.print();

    }

    @Override
    void printYourName() {
        super.printYourName();
    }

}
