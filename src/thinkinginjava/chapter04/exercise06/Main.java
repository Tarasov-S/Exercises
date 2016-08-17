package thinkinginjava.chapter04.exercise06;
/*
 * Chapter 4. Exercise 6. Difficult - 2/10.
 *
 * Modify the two test( ) methods in the previous two programs so that they take two extra arguments, begin
 * and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(test(25, 20, 30));   // Out: 0
        System.out.println(test(20, 20, 30));   // Out: 0
        System.out.println(test(30, 20, 30));   // Out: 0
        System.out.println(test(10, 20, 30));   // Out: -1
        System.out.println(test(40, 20, 30));   // Out: 1
    }

    private static int test(int testval, int begin, int end) {
        if (testval < begin)
            return -1;      // To the left of the range.
        if (testval > end)
            return +1;      // To the right of the range.

        return 0;           // In the range.
    }
}
