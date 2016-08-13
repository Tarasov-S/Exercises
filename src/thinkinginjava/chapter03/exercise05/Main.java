package thinkinginjava.chapter03.exercise05;

/*
 * Chapter 3. Exercise 5. Difficult - 2/10.
 *
 * Create a class called Dog containing two Strings: name and says. In main( ), create two dog objects with
 * names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). Then display their names and what they say.
 */

public class Main {

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");

        spot.displayName();     // out: Spot
        spot.speak();           // out: Ruff!

        scruffy.displayName();  // out: Scruffy
        scruffy.speak();        // out: Wurf!
    }
}
