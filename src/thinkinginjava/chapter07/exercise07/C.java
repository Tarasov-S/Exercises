package thinkinginjava.chapter07.exercise07;

/*
 * Chapter 7. Exercise 7. Difficult - 1/10.
 *
 * Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
 * Write a constructor for C and perform all initialization within C’s constructor.
 */

public class C extends A {

    B b;

    public C() {
        super(11);
        b = new B(22);
        System.out.println("Create C");
    }


    public static void main(String[] args) {
        new C();
    }
}

/*
 * Out:
 *
 * A received 11
 * B received 22
 * Create C
 */
