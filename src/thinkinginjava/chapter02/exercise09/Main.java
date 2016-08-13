package thinkinginjava.chapter02.exercise09;

/*
 * Chapter 2. Exercise 9. Difficult - 2/10.
 *
 * Write a program that demonstrates that autoboxing
 * works for all the primitive types and their wrappers.
 */

public class Main {

    public static void main(String[] args) {
        AutoBoxing autoBoxing = new AutoBoxing();

        int a = autoBoxing.getObjectInt();
        Integer b = autoBoxing.getPrimitiveInt();

        autoBoxing.printObjectInt(a);       // out: 33
        autoBoxing.printPrimitiveInt(b);    // out: 22
    }
}
