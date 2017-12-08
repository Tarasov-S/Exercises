package thinkinginjava.chapter08.exercise16;

/*
 * Chapter 8. Exercise 16. Difficult - 3/10.
 *
 * Following the example in Transmogrify.java, create a Starship class containing an AlertStatus reference
 * that can indicate three different states. Include methods to change the states.
 */

public class Main {

    public static void main(String[] args) {

        State state = new State();
        state.showStatus();

        state.setSevereAlert();
        state.showStatus();

        state.setElevatedAlert();
        state.showStatus();
    }
}

/*
 * Out:
 *
 * Low Alert
 * Severe Alert
 * Elevated Alert
 */
