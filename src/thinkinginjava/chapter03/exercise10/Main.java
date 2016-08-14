package thinkinginjava.chapter03.exercise10;

/*
 * Chapter 3. Exercise 10. Difficult - 3/10.
 *
 * Write a program with two constant values, one with alternating binary ones and zeroes, with a zero in
 * the least-significant digit, and the second, also alternating, with a one in the least-significant digit
 * (hint: It’s easiest to use hexadecimal constants for this). Take these two values and combine them in all
 * possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).
 */

public class Main {

    public static void main(String[] args) {

        binPrint(0b0 & 0b0);        // Out: 0
        binPrint(0b1 & 0b0);        // Out: 0
        binPrint(0b1 & 0b1);        // Out: 1
        binPrint(0b011 & 0b001);    // Out: 1

        binPrint(0b0 | 0b0);        // Out: 0
        binPrint(0b1 | 0b0);        // Out: 1
        binPrint(0b1 | 0b1);        // Out: 1
        binPrint(0b011 | 0b001);    // Out: 11

        binPrint(0b0 ^ 0b0);         // Out: 0
        binPrint(0b1 ^ 0b0);         // Out: 1
        binPrint(0b1 ^ 0b1);         // Out: 0
        binPrint(0b011 ^ 0b001);     // Out: 10

        int i = 0b1111111111110000000011111111111;
        binPrint(i);    // Out: 1111111111110000000011111111111
        binPrint(~i);   // Out: 10000000000001111111100000000000
        binPrint(~~i);  // Out: 1111111111110000000011111111111
    }

    private static void binPrint(int i) {
        String s = Integer.toBinaryString(i);
        System.out.println(s);
    }
}
