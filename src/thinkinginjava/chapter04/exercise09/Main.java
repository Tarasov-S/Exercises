package thinkinginjava.chapter04.exercise09;

/*
 * Chapter 4. Exercise 9. Difficult - 4/10.
 *
 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each number
 * (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument
 * and displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5
 * (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 * ?
 */

public class Main {

    public static void main(String[] args) {
        fibonacci(100);
    }

    private static void fibonacci(int sequenceLength) {
        if (sequenceLength <= 0) return;

        long preFib = 0;
        long fib = 1;
        long tmp;

        for (int i = 1; i <= sequenceLength; i++) {
            if (fib < 0) {
                System.out.println(i + " : " + fib + "  OUT OF LONG!");
                System.out.println("-- END --");
                return;
            }
            System.out.println(i + " : " + fib);
            tmp = preFib + fib;
            preFib = fib;
            fib = tmp;
        }
    }
}

/*
 * Out:
 *
 * 1 : 1
 * 2 : 1
 * 3 : 2
 * 4 : 3
 * 5 : 5
 * 6 : 8
 * 7 : 13
 * 8 : 21
 * 9 : 34
 * 10 : 55
 * 11 : 89
 * ......
 * ......
 * 87 : 679891637638612258
 * 88 : 1100087778366101931
 * 89 : 1779979416004714189
 * 90 : 2880067194370816120
 * 91 : 4660046610375530309
 * 92 : 7540113804746346429
 * 93 : -6246583658587674878  OUT OF LONG!
 * -- END --
 */
