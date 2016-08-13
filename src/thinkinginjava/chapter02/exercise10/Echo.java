package thinkinginjava.chapter02.exercise10;

/*
 * Chapter 2. Exercise 10. Difficult - 2/10.
 *
 * Write a program that prints three arguments taken from the command line.
 * To do this, you’ll need to index into the command-line array of Strings.
 */

public class Echo {

    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}

/*
 * Run:
 *
 * $ java Echo Hello World!
 * Hello
 * World!
 * $
 */
