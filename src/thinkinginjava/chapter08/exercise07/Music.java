package thinkinginjava.chapter08.exercise07;

/*
 * Chapter 8. Exercise 7. Difficult - 2/10.
 *
 * Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.
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
            new Woodwind(),
            new Keyboard()
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
 * Keyboard.play() MIDDLE_C
 * [Keyboard]
 *
 */
