package thinkinginjava.chapter05.exercise02;

/*
 * Chapter 5. Exercise 2. Difficult - 2/10.
 *
 * Create a class with a String field that is initialized at the point of definition, and another one that
 * is initialized by the constructor. What is the difference between the two approaches?
 */

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello("World!");

        System.out.println(hello.initInField);           // Out: Hello!
        System.out.println(hello.initInConstructor);     // Out: World!
    }
}
