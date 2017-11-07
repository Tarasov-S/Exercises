package thinkinginjava.chapter05.exercise14;

/*
 * Chapter 5. Exercise 14. Difficult - 1/10.
 *
 * Create a class with a static String field that is initialized at the point of definition,
 * and another one that is initialized by the static block.
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */

public class Main {

    public static void main(String[] args) {
        Test.show();
    }
}

/* Out:
 *
 * A
 * B
 *
 */
