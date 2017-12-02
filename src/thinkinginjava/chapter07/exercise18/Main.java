package thinkinginjava.chapter07.exercise18;

/*
 * Chapter 7. Exercise 18. Difficult - 2/10.
 *
 * Create a class with a static final field and a final field and demonstrate the difference between the two.
 */

public class Main {

    public static void main(String[] args) {
        A a = new A();

        // a.f1 = 0;        // Error: java: cannot assign a value to final variable f1
        // A.SF_1 = 0;      // Error: java: cannot assign a value to final variable SF_1
    }
}
