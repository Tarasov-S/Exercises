package thinkinginjava.chapter08.exercise09;

/*
 * Chapter 8. Exercise 9. Difficult - 3/10.
 *
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class,
 * provide methods that are common to all Rodents, and override these in the derived classes to perform
 * different behaviors depending on the specific type of Rodent. Create an array of Rodent,
 * fill it with different specific types of Rodents, and call your base-class methods to see what happens.
 */

public class Main {

    public static void main(String[] args) {

        Rodent[] rodents = {
            new Beaver(),
            new Hamster(),
            new Squirrel(),
            new Rat()
        };

        for (Rodent rodent : rodents) {
            rodent.feed();
            rodent.sleep();
            System.out.println();
        }
    }
}

/*
 * Out:
 *
 * Beaver.feed
 * Beaver.sleep
 *
 * Hamster.feed
 * Hamster.sleep
 *
 * Squirrel.feed
 * Squirrel.sleep
 *
 * Rat.feed
 * Rat.sleep
 *
 */
