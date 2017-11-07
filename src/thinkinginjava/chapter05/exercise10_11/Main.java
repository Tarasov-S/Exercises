package thinkinginjava.chapter05.exercise10_11;

/*
 * Chapter 5. Exercise 10. Difficult - 2/10.
 *
 * Create a class with a finalize( ) method that prints a message.
 * In main( ), create an object of your class. Explain the behavior of your program.
 */

/*
 * Chapter 5. Exercise 10. Difficult - 4/10.
 *
 * Modify the previous exercise so that your finalize( ) will always be called.
 */

public class Main {

    public static void main(String[] args) {

        new Test();
        System.gc();        // Out: Finalized
    }
}
