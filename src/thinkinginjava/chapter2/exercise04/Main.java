package thinkinginjava.chapter2.exercise04;

/*
 * Chapter 2. Exercise 4. Difficult - 1/10.
 *
 * Turn the DataOnly code fragments into a program
 * that compiles and runs.
 */

public class Main {

    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println(data.i);     // out:  47
        System.out.println(data.d);     // out:  1.1
        System.out.println(data.b);     // out:  false
    }
}
