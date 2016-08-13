package thinkinginjava.chapter03.exercise02;

/*
 * Chapter 3. Exercise 2. Difficult - 1/10.
 *
 * Create a class containing a float and use it to demonstrate aliasing.
 */

public class Main {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();

        v1.i = 1.11f;
        v2.i = 2.22f;

        System.out.println("v1.i = " + v1.i);   // out: v1.i = 1.11
        System.out.println("v2.i = " + v2.i);   // out: v2.i = 2.22

        v1 = v2;
        v1.i = 3.33f;

        System.out.println("v1.i = " + v1.i);   // out: v1.i = 3.33
        System.out.println("v2.i = " + v2.i);   // out: v2.i = 3.33
    }
}
