package thinkinginjava.chapter09.exercise01;

/*
 * Chapter 9. Exercise 1. Difficult - 1/10.
 *
 * Modify Exercise 9 in the previous chapter so that Rodent is an abstract class.
 * Make the methods of Rodent abstract whenever possible.
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
