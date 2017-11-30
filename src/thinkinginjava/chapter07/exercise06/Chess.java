package thinkinginjava.chapter07.exercise06;

/*
 * Chapter 7. Exercise 6. Difficult - 1/10.
 *
 * Using Chess.java, prove the statements in the previous paragraph.
 */

public class Chess extends BoardGame {

    Chess() {
        super(11);
        System.out.println("Chess constructor");
        // super(11);      // call to super must be first
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

/*
 * Out:
 *
 * Error: java: constructor BoardGame in class
 * thinkinginjava.chapter07.exercise06.BoardGame cannot be applied to given types;
 *   required: int
 *   found: no arguments
 *   reason: actual and formal argument lists differ in length
 *
 * Error: java: call to super must be first statement in constructor
 */
