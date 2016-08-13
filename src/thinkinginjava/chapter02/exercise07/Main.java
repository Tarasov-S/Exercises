package thinkinginjava.chapter02.exercise07;

/*
 * Chapter 2. Exercise 7. Difficult - 1/10.
 *
 * Turn the Incrementable code fragments into a working program.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(StaticTest.i);   // out: 47
        Incrementable.increment();
        System.out.println(StaticTest.i);   // out: 48
    }
}
