package thinkinginjava.chapter05.exercise17_18;

/*
 * Chapter 5. Exercise 17. Difficult - 2/10.
 *
 * Create a class with a constructor that takes a String argument.
 * During construction, print the argument. Create an array of object references to this class,
 * but don’t actually create objects to assign into the array. When you run the program,
 * notice whether the initialization messages from the constructor calls are printed.
 */

/*
 * Chapter 5. Exercise 18. Difficult - 1/10.
 *
 * Complete the previous exercise by creating objects to attach to the array of references.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("main: new Test[3];");
        Test[] array = new Test[3];

        System.out.println("main: new Test(\"...\");");
        array[0] = new Test("ABC");
        array[1] = new Test("DEF");
        array[2] = new Test("GHI");
    }
}

/* Out:
 *
 * main: new Test[3];
 * main: new Test("...");
 * Test: ABC
 * Test: DEF
 * Test: GHI
 *
 */
