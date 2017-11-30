package thinkinginjava.chapter07.exercise05;

/*
 * Chapter 7. Exercise 5. Difficult - 1/10.
 *
 * Create two classes, A and B, with default constructors (empty argument lists) that announce themselves.
 * Inherit a new class called C from A, and create a member of class B inside C.
 * Do not create a constructor for C. Create an object of class C and observe the results.
 */

public class C extends A {

    B b = new B();

    public static void main(String[] args) {
        new C();
    }
}

/*
 * Out:
 *
 * A
 * B
 */
