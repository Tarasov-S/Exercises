package thinkinginjava.chapter05.exercise08;

/*
 * Chapter 5. Exercise 8. Difficult - 1/10.
 *
 * Create a class with two methods. Within the first method, call the second method twice:
 * the first time without using this, and the second time using this—just to see it working;
 * you should not use this form in practice.
 */

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.callTheMethod();   // Out: It work! It work!
    }
}
