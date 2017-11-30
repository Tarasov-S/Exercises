package thinkinginjava.chapter07.exercise08;

/*
 * Chapter 7. Exercise 8. Difficult - 1/10.
 *
 * Create a base class with only a non-default constructor,
 * and a derived class with both a default (no-arg) and non-default constructor.
 * In the derived-class constructors, call the base-class constructor.
 */

public class B extends A {

    public B(int i) {
        super(i);
        System.out.println("B(int i)");
    }

    public B() {
        this(42);
        System.out.println("B()");
    }


    public static void main(String[] args) {
        new B();
    }
}

/*
 * Out:
 *
 * A received 42
 * B(int i)
 * B()
 */
