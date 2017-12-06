package thinkinginjava.chapter08.exercise08;

/*
 * Chapter 8. Exercise 8. Difficult - 2/10.
 *
 * Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
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
        RandomGenerator randGen = new RandomGenerator();
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = randGen.nextInstrument();
        }
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
 * Brass.play() MIDDLE_C
 * [Brass]
 *
 * Wind.play() MIDDLE_C
 * [Wind]
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
 * Wind.play() MIDDLE_C
 * [Wind]
 *
 * Woodwind.play() MIDDLE_C
 * [Woodwind]
 *
 * Keyboard.play() MIDDLE_C
 * [Keyboard]
 *
 */
