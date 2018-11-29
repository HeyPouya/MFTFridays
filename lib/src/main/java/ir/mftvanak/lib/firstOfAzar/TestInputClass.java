package ir.mftvanak.lib.firstOfAzar;

import java.util.Scanner;

public class TestInputClass {

    public static void main(String[] args) {

        System.out.println("Please enter a number");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println("the number you entered was :" + a);

        String s = scanner.next();

        System.out.print("you entered " + s);

    }
}
