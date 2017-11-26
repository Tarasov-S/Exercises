package thinkinginjava.chapter06.exercise07;

/*
 * Chapter 6. Exercise 7. Difficult - 1/10.
 *
 * Create the library according to the code fragments describing access and Widget.
 * Create a Widget in a class that is not part of the access package.
 */

import thinkinginjava.chapter06.exercise07.access.Widget;

public class Main {

    public static void main(String[] args) {
        Widget widget = new Widget("Hello!");
        widget.action();    // Out: Widget
    }
}
