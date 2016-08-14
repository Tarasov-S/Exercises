package thinkinginjava.chapter03.exercise08;

/*
 * Chapter 3. Exercise 8. Difficult - 2/10.
 *
 * Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.
 */

public class Main {

    public static void main(String[] args) {

        long dec = 1234567890;
        long bin = 0b1001001100101100000001011010010;
        long oct = 011145401322;
        long hex = 0x499602d2;

        System.out.println(dec == bin && dec == oct && dec == hex);     // out: true

        System.out.println(Long.toString(dec));         // out: 1234567890
        System.out.println(Long.toBinaryString(dec));   // out: 1001001100101100000001011010010
        System.out.println(Long.toOctalString(dec));    // out: 11145401322
        System.out.println(Long.toHexString(dec));      // out: 499602d2
    }
}
