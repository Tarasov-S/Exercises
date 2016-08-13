package thinkinginjava.chapter2.exercise16;

import java.io.PrintStream;

/**
 * Print methods that can be used without qualifiers,
 * using Java SE5 static imports.
 */
public class Print {


    /**
     * Print with a newline.
     *
     * @param obj Object designed for printing.
     */
    public static void print(Object obj) {
        System.out.println(obj);
    }


    /**
     * Print a newline by itself.
     */
    public static void print() {
        System.out.println();
    }

    //

    /**
     * Print with no line break.
     *
     * @param obj Object designed for printing.
     */
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    /**
     * The new Java SE5 printf() (from C):
     *
     * @param format A format string as described in Format string syntax.
     * @param args   Objects designed for printing.
     * @return This output stream.
     */
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}