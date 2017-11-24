package thinkinginjava.chapter06.exercise01;

/*
 * Chapter 6. Exercise 1. Difficult - 1/10.
 *
 * Create a class in a package. Create an instance of your class outside of that package.
 */

public class Main {

    public static void main(String[] args) {
        new outPkg();                                           // Out: outPkg
        new thinkinginjava.chapter06.exercise01.pkg.inPkg();    // Out: inPkg
        // new inPkg();    // java: cannot find symbol
    }
}
