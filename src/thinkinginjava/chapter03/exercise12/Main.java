package thinkinginjava.chapter03.exercise12;

/*
 * Chapter 3. Exercise 12. Difficult - 3/10.
 *
 * Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift operator to
 * right shift through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
 */

public class Main {

    public static void main(String[] args) {
        int i = 0b11111111;
        binPrint(i);        // Out: 11111111
        binPrint(i << 1);     // Out: 111111110
        binPrint(i << 2);     // Out: 1111111100
        binPrint(i << 3);     // Out: 11111111000
        binPrint(i << 4);     // Out: 111111110000

        binPrint(i);        // Out: 11111111
        binPrint(i >> 1);     // Out: 1111111
        binPrint(i >> 2);     // Out: 111111
        binPrint(i >> 3);     // Out: 11111
        binPrint(i >> 4);     // Out: 1111
        binPrint(i >> 5);     // Out: 111
        binPrint(i >> 6);     // Out: 11
        binPrint(i >> 7);     // Out: 1
        binPrint(i >> 8);     // Out: 0
    }

    private static void binPrint(int i) {
        String s = Integer.toBinaryString(i);
        System.out.println(s);
    }
}
