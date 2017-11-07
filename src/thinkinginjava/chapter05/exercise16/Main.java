package thinkinginjava.chapter05.exercise16;

/*
 * Chapter 5. Exercise 16. Difficult - 1/10.
 *
 * Create an array of String objects and assign a String to each element.
 * Print the array by using a for loop.
 */

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[]{"ABC", "DEF", "GHI"};

        for (String str : strings) System.out.println(str);
    }
}
