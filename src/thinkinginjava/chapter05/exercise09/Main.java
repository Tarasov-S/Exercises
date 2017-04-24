package thinkinginjava.chapter05.exercise09;

/*
 * Chapter 5. Exercise 9. Difficult - 1/10.
 *
 * Create a class with two (overloaded) constructors.
 * Using this, call the second constructor inside the first one.
 */

public class Main {

    public static void main(String[] args) {

        Test t1 = new Test("something");
        t1.printStr();              // Out: something

        Test t2 = new Test();
        t2.printStr();              // Out: nothing
    }
}
