package thinkinginjava.chapter05.exercise01;

/*
 * Chapter 5. Exercise 1. Difficult - 1/10.
 *
 * Create a class containing an uninitialized String reference. Demonstrate that this reference
 * is initialized by Java to null.
 */

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.str == null);   // Out: true
    }
}
