package thinkinginjava.chapter04.exercise02;

/*
 * Chapter 4. Exercise 2. Difficult - 2/10.
 *
 * Write a program that generates 25 random int values. For each value, use an if-else statement to classify
 * it as greater than, less than, or equal to a second randomly generated value.
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int b;

        for (int i = 0; i < 25; i++) {
            a = random.nextInt(10);
            b = random.nextInt(10);
            compare(a, b);
        }
    }

    private static void compare(int a, int b) {
        String relation;

        if (a < b) {
            relation = " < ";
        } else if (a > b) {
            relation = " > ";
        } else {
            relation = " = ";
        }
        System.out.println(a + relation + b);
    }
}

/*
 * Out:
 *
 * 1 = 1
 * 9 > 6
 * 5 > 3
 * 8 > 4
 * .....
 * .....
 * 9 > 1
 * 4 < 9
 * 4 > 0
 */