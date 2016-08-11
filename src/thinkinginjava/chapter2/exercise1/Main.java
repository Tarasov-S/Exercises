package thinkinginjava.chapter2.exercise1;

/*
 * Chapter 2. Exercise 1. Difficult - 2/10.
 *
 * Create a class containing an int and a char that are not initialized,
 * and print their values to verify that Java performs default initialization.
 */

public class Main {

    public static void main(String[] args) {
        DefaultInitFields fields = new DefaultInitFields();

        System.out.println("int = " + fields.anInt);            // out:  int = 0
        System.out.println("double = " + fields.aDouble);       // out:  double = 0.0
        System.out.println("char = " + fields.aChar);           // out:  char =
        System.out.println("boolean = " + fields.aBoolean);     // out:  boolean = false
        System.out.println("String = " + fields.aString);       // out:  String = null
    }
}
