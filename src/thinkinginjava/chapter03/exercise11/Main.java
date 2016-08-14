package thinkinginjava.chapter03.exercise11;

/*
 * Chapter 3. Exercise 11. Difficult - 3/10.
 *
 * Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant).
 * Using the signed right-shift operator, right shift it all the way through all of its binary positions, each
 * time displaying the result using Integer.toBinaryString( ).
 */

public class Main {

    public static void main(String[] args) {
        int i = 0b10000000;
        binPrint(i);        // Out: 10000000
        binPrint(i >> 1);     // Out: 1000000
        binPrint(i >> 2);     // Out: 100000
        binPrint(i >> 3);     // Out: 10000
        binPrint(i >> 4);     // Out: 1000
        binPrint(i >> 5);     // Out: 100
        binPrint(i >> 6);     // Out: 10
        binPrint(i >> 7);     // Out: 1
        binPrint(i >> 8);     // Out: 0
    }

    private static void binPrint(int i) {
        String s = Integer.toBinaryString(i);
        System.out.println(s);
    }
}
