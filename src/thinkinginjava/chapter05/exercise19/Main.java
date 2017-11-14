package thinkinginjava.chapter05.exercise19;

/*
 * Chapter 5. Exercise 19. Difficult - 2/10.
 *
 * Write a method that takes a vararg String array.
 * Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
 */

public class Main {

    public static void main(String[] args) {
        varargs();
        varargs("ABC");
        varargs("ABC", "DEF", "GHI");

        String[] strings = {"abc", "def", "ghi"};
        varargs(strings);
    }

    private static void varargs(String... strings) {
        System.out.println("Start of method ...");

        for (String s : strings) System.out.println(s);

        System.out.println("... End of method\n");
    }
}


/* Out:
 *
 * Start of method ...
 * ... End of method
 *
 * Start of method ...
 * ABC
 * ... End of method
 *
 * Start of method ...
 * ABC
 * DEF
 * GHI
 * ... End of method
 *
 * Start of method ...
 * abc
 * def
 * ghi
 * ... End of method
 *
 */