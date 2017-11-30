package thinkinginjava.chapter07.exercise16;

/*
 * Chapter 7. Exercise 16. Difficult - 2/10.
 *
 * Create a class called Amphibian. From this, inherit a class called Frog.
 * Put appropriate methods in the base class. In main( ),
 * create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
 */

public class Main {

    public static void main(String[] args) {

        Frog frog = new Frog();
        frog.walk();        // Out: Walk
        frog.swim();        // Out: Swim
        frog.jump();        // Out: Jump
        frog.croak();       // Out: Croak

        Amphibian amphibian = new Frog();
        amphibian.walk();   // Out: Walk
        amphibian.swim();   // Out: Swim

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
