package thinkinginjava.chapter07.exercise04;

/*
 * Chapter 7. Exercise 4. Difficult - 2/10.
 *
 * Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.
 */

public class ClassC extends ClassB {

    public ClassC() {
        System.out.println("ClassC");
    }

    public static void main(String[] args) {
        new ClassC();
        System.out.println("------");
        new ClassB();
    }
}

/*
 * Out:
 *
 * ClassA
 * ClassB
 * ClassC
 * ------
 * ClassA
 * ClassB
 */
