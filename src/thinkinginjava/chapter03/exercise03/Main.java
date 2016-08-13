package thinkinginjava.chapter03.exercise03;

/*
 * Chapter 3. Exercise 3. Difficult - 1/10.
 *
 * Create a class containing a float and use it to demonstrate aliasing during method calls.
 */

public class Main {

    public static void main(String[] args) {
        Value val = new Value();

        val.i = 3.33f;
        System.out.println("val.i = " + val.i);     // out: val.i = 3.33

        Algebra.squareValue(val);

        System.out.println("val.i = " + val.i);     // out: val.i = 11.0889
    }


}
