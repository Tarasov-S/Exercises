package thinkinginjava.chapter04.exercise10;

/*
 * Chapter 4. Exercise 10. Difficult - 5/10.
 *
 * A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing
 * half the number of digits of the result. The digits are taken from the original number in any order.
 * Pairs of trailing zeroes are not allowed.
 *     Examples include:
 *     1260 = 21 * 60
 *     1827 = 21 * 87
 *     2187 = 27 * 81
 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        findVampire();
    }

    private static void findVampire() {
        char[] axb;
        char[] ab;

        for (int a = 10; a <= 99; a++) {
            for (int b = 10; b < 99; b++) {
                axb = intToCharArray(a * b);
                ab = intToCharArray(a, b);
                Arrays.sort(axb);
                Arrays.sort(ab);

                if (Arrays.equals(axb, ab)) {
                    System.out.println(a + " * " + b + " = " + (a * b));
                }
            }
        }
    }

    private static char[] intToCharArray(int axb) {
        String s = String.valueOf(axb);
        return s.toCharArray();
    }

    private static char[] intToCharArray(int a, int b) {
        char[] aArray = intToCharArray(a);
        char[] bArray = intToCharArray(b);
        char[] abArray = new char[aArray.length + bArray.length];

        for (int i = 0; i < abArray.length; i++) {
            if (i < aArray.length) {
                abArray[i] = aArray[i];
            } else {
                abArray[i] = bArray[i - aArray.length];
            }
        }
        return abArray;
    }
}

/*
 * Out:
 *
 * 15 * 93 = 1395
 * 21 * 60 = 1260
 * 21 * 87 = 1827
 * 27 * 81 = 2187
 * 30 * 51 = 1530
 * 35 * 41 = 1435
 * 41 * 35 = 1435
 * 51 * 30 = 1530
 * 60 * 21 = 1260
 * 80 * 86 = 6880
 * 81 * 27 = 2187
 * 86 * 80 = 6880
 * 87 * 21 = 1827
 * 93 * 15 = 1395
 */
