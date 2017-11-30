package thinkinginjava.chapter07.exercise13;

/*
 * Chapter 7. Exercise 13. Difficult - 2/10.
 *
 * Create a class with a method that is overloaded three times. Inherit a new class,
 * add a new overloading of the method, and show that all four methods are available in the derived class.
 */

public class B extends A {

    public static void main(String[] args) {
        B b = new B();

        b.setData(3.14);    // Out: Set float '3.14'

        b.setData(42);      // Out: Set int '42'
        b.setData("ABC");   // Out: Set String 'ABC'
        b.setData(true);    // Out: Set boolean 'true'
    }

    void setData(double d) {
        System.out.println("Set double '" + d + "'");
    }
}
