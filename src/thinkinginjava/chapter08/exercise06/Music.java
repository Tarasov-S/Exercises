package thinkinginjava.chapter08.exercise06;

/*
 * Chapter 8. Exercise 6. Difficult - 1/10.
 *
 * Change Music3.java so that what( ) becomes the root Object method toString( ).
 * Try printing the Instrument objects using System.out.println( ) (without any casting).
 */

public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
            System.out.println(i + "\n");
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}

/*
 * Out:
 *
 * Wind.play() MIDDLE_C
 * [Wind]
 *
 * Percussion.play() MIDDLE_C
 * [Percussion]
 *
 * Stringed.play() MIDDLE_C
 * [Stringed]
 *
 * Brass.play() MIDDLE_C
 * [Brass]
 *
 * Woodwind.play() MIDDLE_C
 * [Woodwind]
 *
 */
