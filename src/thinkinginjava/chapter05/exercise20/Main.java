package thinkinginjava.chapter05.exercise20;

/*
 * Chapter 5. Exercise 20. Difficult - 1/10.
 *
 * Create a main( ) that uses varargs instead of the ordinary main( ) syntax.
 * Print all the elements in the resulting args array.
 * Test it with various numbers of command-line arguments.
 */

public class Main {

    public static void main(String... args) {

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println();
    }
}

/* CLI:
 *
 * $ java thinkinginjava.chapter05.exercise20.Main
 *
 * $ java thinkinginjava.chapter05.exercise20.Main ABC
 *   ABC
 *
 * $ java thinkinginjava.chapter05.exercise20.Main ABC DEF GHI
 *   ABC
 *   DEF
 *   GHI
 *
 * $
 *
 */