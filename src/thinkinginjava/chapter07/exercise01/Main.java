package thinkinginjava.chapter07.exercise01;

/*
 * Chapter 7. Exercise 1. Difficult - 2/10.
 *
 * Create a simple class. Inside a second class, define a reference to an object of the first class.
 * Use lazy initialization to instantiate this object.
 */

public class Main {

    public static void main(String[] args) {

        Test test;

        test = new Test();
        test.setData("ABC");
        System.out.println(test);   // Out: data = ABC

        test = new Test();
        System.out.println(test);   // Out: NO DATA
    }
}
