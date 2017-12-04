package thinkinginjava.chapter07.exercise23;

/*
 * Chapter 7. Exercise 23. Difficult - 2/10.
 * <p>
 * Prove that class loading takes place only once. Prove that loading may be caused by either
 * the creation of the first instance of that class or by the access of a static member.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("------- 1 -------");

        new C();

        System.out.println("------- 2 -------");

        new C();

        System.out.println("------- 3 -------");

        new B();

        System.out.println("------- 4 -------");

        System.out.println(C1.x);
        System.out.println(C1.x);
        System.out.println(B1.x);

        System.out.println("------- 5 -------");

        new C1();
    }

    public static int initInt(String msg, int i) {
        System.out.println("Init: " + i + " : " + msg);
        return i;
    }
}

/*
 * Out:
 *
 * ------- 1 -------
 * Init: 11 : A.x static
 * Init: 33 : B.x static
 * Init: 55 : C.x static
 * Init: 22 : A.y non-static
 * A()
 * Init: 44 : B.y non-static
 * B()
 * Init: 66 : C.y non-static
 * C()
 * ------- 2 -------
 * Init: 22 : A.y non-static
 * A()
 * Init: 44 : B.y non-static
 * B()
 * Init: 66 : C.y non-static
 * C()
 * ------- 3 -------
 * Init: 22 : A.y non-static
 * A()
 * Init: 44 : B.y non-static
 * B()
 * ------- 4 -------
 * Init: 111 : A1.x static
 * Init: 333 : B1.x static
 * Init: 555 : C1.x static
 * 555
 * 555
 * 333
 * ------- 5 -------
 * Init: 222 : A1.y non-static
 * A1()
 * Init: 444 : B1.y non-static
 * B1()
 * Init: 666 : C1.y non-static
 * C1()
 *
 */
