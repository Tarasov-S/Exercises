package thinkinginjava.chapter05.exercise04;

/*
 * Chapter 5. Exercise 4. Difficult - 1/10.
 *
 * Add an overloaded constructor to the previous exercise that takes a String argument and prints
 * it along with your message.
 */

public class Main {

    public static void main(String[] args) {
        Test test1 = new Test();            // Out: Hello!
        Test test2 = new Test("World!");    // Out: World!
    }
}
