package thinkinginjava.chapter07.exercise12;

/*
 * Chapter 7. Exercise 12. Difficult - 3/10.
 *
 * Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
 */

public class Stem extends Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Stem() {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Stem()");
    }

    public static void main(String[] args) {
        Stem stem = new Stem();

        try {
            stem.action();
        } finally {
            stem.dispose();
        }
    }

    void action() {
        System.out.println("-= Action =-");
    }

    void dispose() {
        System.out.println("Stem dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
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
 * -= Action =-
 * Stem dispose
 * Component3 dispose
 * Component2 dispose
 * Component1 dispose
 * Root dispose
 * Component3 dispose
 * Component2 dispose
 * Component1 dispose
 */
