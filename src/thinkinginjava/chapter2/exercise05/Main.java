package thinkinginjava.chapter2.exercise05;

/*
 * Chapter 2. Exercise 5. Difficult - 1/10.
 *
 * Modify the previous exercise so that the values of the data
 * in DataOnly are assigned to and printed in main( ).
 */

public class Main {

    public static void main(String[] args) {
        DataOnly data = new DataOnly();

        System.out.println(data.i);     // out:  47
        System.out.println(data.d);     // out:  1.1
        System.out.println(data.b);     // out:  false
    }

}
