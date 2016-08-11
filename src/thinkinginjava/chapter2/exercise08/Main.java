package thinkinginjava.chapter2.exercise08;

/*
 * Chapter 2. Exercise 8. Difficult - 3/10.
 *
 * Write a program that demonstrates that, no matter how many objects
 * you create of a particular class, there is only one instance
 * of a particular static field in that class.
 */

public class Main {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        Incrementable sf = new Incrementable();

        System.out.println("StaticTest.i = " + StaticTest.i);   // out: StaticTest.i = 47
        System.out.println("st1.i = " + st1.i);                 // out: st1.i = 47
        System.out.println("st2.i = " + st2.i);                 // out: st2.i = 47

        StaticTest.i++;

        System.out.println("StaticTest.i = " + StaticTest.i);   // out: StaticTest.i = 48
        System.out.println("st1.i = " + st1.i);                 // out: st1.i = 48
        System.out.println("st2.i = " + st2.i);                 // out: st2.i = 48

        st1.i++;

        System.out.println("StaticTest.i = " + StaticTest.i);   // out: StaticTest.i = 49
        System.out.println("st1.i = " + st1.i);                 // out: st1.i = 49
        System.out.println("st2.i = " + st2.i);                 // out: st2.i = 49

        Incrementable.increment();

        System.out.println("StaticTest.i = " + StaticTest.i);   // out: StaticTest.i = 50
        System.out.println("st1.i = " + st1.i);                 // out: st1.i = 50
        System.out.println("st2.i = " + st2.i);                 // out: st2.i = 50

        sf.increment();

        System.out.println("StaticTest.i = " + StaticTest.i);   // out: StaticTest.i = 51
        System.out.println("st1.i = " + st1.i);                 // out: st1.i = 51
        System.out.println("st2.i = " + st2.i);                 // out: st2.i = 51
    }
}

/*
 * Using the class name is the preferred way to refer to a static variable.
 * Not only does it emphasize that variable’s static nature,
 * but in some cases it gives the compiler better opportunities for optimization.
 */
