package thinkinginjava.chapter05.exercise15;

/*
 * Chapter 5. Exercise 15. Difficult - 1/10.
 *
 * Create a class with a String that is initialized using instance initialization.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("main()");

        System.out.println("main: new Test()");
        Test test = new Test();

        System.out.println("main: test.showString()");
        test.showString();
    }
}

/* Out:
 *
 * main()
 * main: new Test()
 * String initialized
 * Test()
 * main: test.showString()
 * ABC
 *
 */