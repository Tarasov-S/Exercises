package thinkinginjava.chapter03.exercise13;

/*
 * Chapter 3. Exercise 13. Difficult - 1/10.
 *
 * Write a method that displays char values in binary form. Demonstrate it using several different characters.
 */

public class Main {

    public static void main(String[] args) {

        bitPrint('c');  // Out: c : 1100011
        bitPrint('h');  // Out: h : 1101000
        bitPrint('a');  // Out: a : 1100001
        bitPrint('r');  // Out: r : 1110010
    }

    private static void bitPrint(char c) {
        String s = Integer.toBinaryString(c);
        System.out.println(c + " : " + s);
    }
}
