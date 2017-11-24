package thinkinginjava.chapter06.exercise04;

/*
 * Chapter 6. Exercise 4. Difficult - 2/10.
 *
 * Create a class in a package. Create an instance of your class outside of that package.
 */

public class Main {

    public static void main(String[] args) {

        Test.test();        // Out: Hello World!

        // thinkinginjava.chapter06.exercise04.pkg.Test.test();
        // Error: java: test() has protected access in thinkinginjava.chapter06.exercise04.pkg.Test
    }
}
