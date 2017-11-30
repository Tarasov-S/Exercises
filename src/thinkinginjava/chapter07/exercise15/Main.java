package thinkinginjava.chapter07.exercise15;

/*
 * Chapter 7. Exercise 15. Difficult - 2/10.
 *
 * Create a class inside a package. Your class should contain a protected method.
 * Outside of the package, try to call the protected method and explain the results.
 * Now inherit from your class and call the protected method from inside a method of your derived class.
 */

import thinkinginjava.chapter07.exercise15.pkg.A;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        // a.action();  // Error: java: action() has protected access in thinkinginjava.chapter07.exercise15.pkg.A

        B b = new B();
        b.action();     // Out: Action!
    }
}
