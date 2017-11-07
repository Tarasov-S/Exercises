package thinkinginjava.chapter05.exercise13;

/*
 * Chapter 5. Exercise 13. Difficult - 1/10.
 *
 * Verify the statements in the previous paragraph.
 */

public class ExplicitStatic1 {

    public static void main(String[] args) {
        System.out.println("main()");

        Cups.cup1.f(99);
    }

//  static Cups cups1 = new Cups();
//  static Cups cups2 = new Cups();
}

/* Out:
 *
 * main()
 * Cup(1)
 * Cup(2)
 * f(99)
 *
 */
