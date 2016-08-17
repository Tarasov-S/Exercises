package thinkinginjava.chapter04.exercise07;

/*
 * Chapter 4. Exercise 7. Difficult - 1/10.
 *
 * Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) break;        // End of loop.
        }
        System.out.println("End of loop: break;");

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 99) return;       // End of method.
        }
        System.out.println("End of loop: return;");     // It never will work.
    }
}

/*
 * Out:
 *
 * 1
 * 2
 * 3
 * 4
 * .....
 * .....
 * 95
 * 96
 * 97
 * 98
 * 99
 * End of loop: break;
 * 1
 * 2
 * 3
 * 4
 * .....
 * .....
 * 95
 * 96
 * 97
 * 98
 * 99
 */