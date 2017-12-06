package thinkinginjava.chapter08.exercise10;

/*
 * Chapter 8. Exercise 10. Difficult - 3/10.
 *
 * Create a base class with two methods. In the first method, call the second method.
 * Inherit a class and override the second method. Create an object of the derived class,
 * upcast it to the base type, and call the first method. Explain what happens.
 */

public class Main {

    public static void main(String[] args) {

        A a = new B();
        a.first();
    }
}

/*
 * Out:
 *
 * A.first
 * B.second
 *
 */
