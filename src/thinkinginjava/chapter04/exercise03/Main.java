package thinkinginjava.chapter04.exercise03;

/*
 * Chapter 4. Exercise 3. Difficult - 1/10.
 *
 * Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run until
 * you interrupt it from the keyboard (typically by pressing Control-C).
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int b;

        for (; ; ) {
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
 * 5 > 4
 * 5 > 1
 * 1 > 0
 * 7 < 9
 * 5 = 5
 * 8 = 8
 * 5 < 8
 * .....
 * .....
 * .....
 */