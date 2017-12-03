package thinkinginjava.chapter07.exercise21;

/*
 * Chapter 7. Exercise 21. Difficult - 1/10.
 *
 * Create a class with a final method. Inherit from that class and attempt to overwrite that method.
 */

public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        b.f();          // Out: A.f
    }

    // public void f() {
    //     super.f();
    //     System.out.println("B.f");
    // }
    // Error: java: f() in thinkinginjava.chapter07.exercise21.B cannot override f()
    // in thinkinginjava.chapter07.exercise21.A overridden method is final
}
