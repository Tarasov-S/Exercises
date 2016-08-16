package thinkinginjava.chapter04.exercise04;

/*
 * Chapter 4. Exercise 4. Difficult - 3/10.
 *
 * Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers
 * (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(2);
        for (int i = 3; i < 1000; i += 2) {
            for (int j = 2; j <= i; j++) {

                if ((i % j) == 0) {
                    break;
                }
                if (j == (i - 1)) {
                    System.out.println(i);
                }
            }
        }
    }
}

/*
 * Out:
 *
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 * 29
 * 31
 * ...
 * ...
 * ...
 * 953
 * 967
 * 971
 * 977
 * 983
 * 991
 * 997
 */
