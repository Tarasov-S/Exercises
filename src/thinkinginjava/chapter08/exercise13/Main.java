package thinkinginjava.chapter08.exercise13;

/*
 * Chapter 8. Exercise 13. Difficult - 3/10.
 *
 * Add a finalize( ) method to ReferenceCounting.java to verify the termination condition
 * (see the Initialization & Cleanup chapter).
 */

public class Main {

    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };

        System.out.println("------------------");

        for (int i = 0; i < composing.length; i++) {
            composing[i].dispose();
            composing[i] = null;
        }
        shared = null;

        System.out.println("------------------");

        System.gc();
    }
}

/*
 * Out:
 *
 * Create: Shared#0
 * Create: Composing#0
 * Create: Composing#1
 * Create: Composing#2
 * Create: Composing#3
 * Create: Composing#4
 * Create: Composing#5
 * Create: Composing#6
 * ------------------
 * dispose: Composing#0
 * dispose: Composing#1
 * dispose: Composing#2
 * dispose: Composing#3
 * dispose: Composing#4
 * dispose: Composing#5
 * dispose: Composing#6
 * Dispose : Shared#0
 * ------------------
 * OK : Finalize Composing#6
 * OK : Finalize Composing#5
 * OK : Finalize Composing#4
 * OK : Finalize Composing#3
 * OK : Finalize Composing#2
 * OK : Finalize Composing#1
 * OK : Finalize Composing#0
 * OK : Finalize Shared#0
 *
 */
