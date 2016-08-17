package thinkinginjava.chapter04.exercise08;

/*
 * Chapter 4. Exercise 8. Difficult - 2/10.
 *
 * Create a switch statement that prints a message for each case, and put the switch inside a for loop that
 * tries each case. Put a break after each case and test it, then remove the breaks and see what happens.
 */

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1: System.out.println("case 1"); break;
                case 2: System.out.println("case 2"); break;
                case 3: System.out.println("case 3"); break;
                default: System.out.println("default");
            }
        }
        System.out.println("-- End of loop. --");

        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1: System.out.println("case 1");
                case 2: System.out.println("case 2");
                case 3: System.out.println("case 3");
                default: System.out.println("default");
            }
        }
        System.out.println("-- End of loop. --");
    }
}

/*
 * Out:
 *
 * case 1
 * case 2
 * case 3
 * -- End of loop. --
 * case 1
 * case 2
 * case 3
 * default
 * case 2
 * case 3
 * default
 * case 3
 * default
 * -- End of loop. --
 */
