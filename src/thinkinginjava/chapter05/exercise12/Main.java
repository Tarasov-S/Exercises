package thinkinginjava.chapter05.exercise12;

/*
 * Chapter 5. Exercise 12. Difficult - 4/10.
 *
 * Create a class called Tank that can be filled and emptied,
 * and has a termination condition that it must be empty when the object is cleaned up.
 * Write a finalize( ) that verifies this termination condition. In main( ),
 * test the possible scenarios that can occur when your Tank is used.
 */

public class Main {

    public static void main(String[] args) {

        Tank tank;
        for (int i = 0; i < 10; i++) {
            tank = new Tank(i);
            if (i != 5) tank.toEmpty();     // Missed tank number 5.
            tank = null;
        }
        System.gc();        // Out: Warning! The non-empty Tank#5 was destroyed.
    }
}
