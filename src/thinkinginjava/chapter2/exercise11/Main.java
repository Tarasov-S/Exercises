package thinkinginjava.chapter2.exercise11;

/*
 * Chapter 2. Exercise 11. Difficult - 1/10.
 *
 * Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
 */

public class Main {

    public static void main(String[] args) {
        Color color = new Color();

        color.changeColor(16711680);
        int c = color.getColor();
        System.out.println(c);      // out: 16711680
    }
}
