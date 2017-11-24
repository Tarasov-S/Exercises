package thinkinginjava.chapter06.exercise03;

/*
 * Chapter 6. Exercise 3. Difficult - 2/10.
 *
 * Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
 * The first version displays its String argument to the console, the second does nothing.
 * Use a static import line to import the class into a test program,
 * and demonstrate the conditional compilation effect.
 */

import static thinkinginjava.chapter06.exercise03.debug.Debug.debug;

public class Main {

    public static void main(String[] args) {
        String string = "Hello World!";
        debug(string);          // Out: Hello World!
    }
}
