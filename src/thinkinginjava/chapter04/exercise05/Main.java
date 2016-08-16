package thinkinginjava.chapter04.exercise05;

/*
 * Chapter 4. Exercise 5. Difficult - 4/10.
 *
 * Repeat Exercise 10 from the previous chapter, using the ternary operator and a bitwise test to display
 * the ones and zeroes, instead of Integer.toBinaryString( ).
 */

public class Main {

    public static void main(String[] args) {

        bitPrint(0b0 & 0b0);        // Out: 00000000000000000000000000000000
        bitPrint(0b1 & 0b0);        // Out: 00000000000000000000000000000000
        bitPrint(0b1 & 0b1);        // Out: 00000000000000000000000000000001
        bitPrint(0b011 & 0b001);    // Out: 00000000000000000000000000000001

        bitPrint(0b0 | 0b0);        // Out: 00000000000000000000000000000000
        bitPrint(0b1 | 0b0);        // Out: 00000000000000000000000000000001
        bitPrint(0b1 | 0b1);        // Out: 00000000000000000000000000000001
        bitPrint(0b011 | 0b001);    // Out: 00000000000000000000000000000011

        bitPrint(0b0 ^ 0b0);        // Out: 00000000000000000000000000000000
        bitPrint(0b1 ^ 0b0);        // Out: 00000000000000000000000000000001
        bitPrint(0b1 ^ 0b1);        // Out: 00000000000000000000000000000000
        bitPrint(0b011 ^ 0b001);    // Out: 00000000000000000000000000000010

        int i = 0b1111111111100000000111111111111;
        bitPrint(i);    // Out: 01111111111100000000111111111111
        bitPrint(~i);   // Out: 10000000000011111111000000000000
        bitPrint(~~i);  // Out: 01111111111100000000111111111111

        System.out.println("=================");
        int x = 0b11111111111111111111111100001000;

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.bitCount(x));
        System.out.println(Integer.lowestOneBit(x));
        System.out.println(Integer.highestOneBit(x));

    }

    private static void bitPrint(int x) {
        boolean bit;
        char digit;

        for (int i = 31; i >= 0; i--) {
            bit = (x & (1 << i)) != 0;
            digit = bit ? '1' : '0';
            System.out.print(digit);
        }
        System.out.println();
    }
}
