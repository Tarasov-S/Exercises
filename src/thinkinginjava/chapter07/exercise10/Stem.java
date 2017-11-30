package thinkinginjava.chapter07.exercise10;

/*
 * Chapter 7. Exercise 10. Difficult - 1/10.
 *
 * Modify the previous exercise so that each class only has non-default constructors.
 */

public class Stem extends Root {

    Component1 c1 = new Component1(101);
    Component2 c2 = new Component2(202);
    Component3 c3 = new Component3(303);

    public Stem(int i) {
        super(i);
        System.out.println("Stem() received " + i);
    }

    public static void main(String[] args) {
        Stem stem = new Stem(777);
    }
}

/*
 * Out:
 *
 * Component1() received 11
 * Component2() received 22
 * Component3() received 33
 * Root() received 777
 * Component1() received 101
 * Component2() received 202
 * Component3() received 303
 * Stem() received 777
 */
