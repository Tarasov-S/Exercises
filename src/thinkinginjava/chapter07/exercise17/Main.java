package thinkinginjava.chapter07.exercise17;

/*
 * Chapter 7. Exercise 17. Difficult - 1/10.
 *
 * Modify Exercise 16 so that Frog overrides the method definitions from the base class
 * (provides new definitions using the same method signatures). Note what happens in main( ).
 */

public class Main {

    public static void main(String[] args) {

        Frog frog = new Frog();
        frog.walk();        // Out: Frog Walk
        frog.swim();        // Out: Frog Swim
        frog.jump();        // Out: Frog Jump
        frog.croak();       // Out: Frog Croak

        Amphibian amphibian = new Frog();
        amphibian.walk();   // Out: Frog Walk
        amphibian.swim();   // Out: Frog Swim

        /* amphibian.jump();
         *
         * Error: java: cannot find symbol
         * symbol:   method jump()
         * location: variable amphibian of type thinkinginjava.chapter07.exercise16.Amphibian
         */

        /* amphibian.croak();
         *
         * Error: java: cannot find symbol
         * symbol:   method croak()
         * location: variable amphibian of type thinkinginjava.chapter07.exercise16.Amphibian
         */
    }
}
