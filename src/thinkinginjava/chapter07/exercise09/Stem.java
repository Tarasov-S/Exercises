package thinkinginjava.chapter07.exercise09;

/*
 * Chapter 7. Exercise 9. Difficult - 2/10.
 *
 * Create a class called Root that contains an instance of each of the classes (that you also create)
 * named Component1, Component2, and Component3. Derive a class Stem from Root that also contains
 * an instance of each “component.”
 * All classes should have default constructors that print a message about that class.
 */

public class Stem extends Root {

    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    public Stem() {
        System.out.println("Stem()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

/*
 * Out:
 *
 * Component1()
 * Component2()
 * Component3()
 * Root()
 * Component1()
 * Component2()
 * Component3()
 * Stem()
 */
