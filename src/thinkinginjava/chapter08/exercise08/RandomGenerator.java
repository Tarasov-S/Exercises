package thinkinginjava.chapter08.exercise08;

import java.util.Random;

public class RandomGenerator {

    private Random random = new Random(42);

    Instrument nextInstrument() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return new Brass();
            case 1:
                return new Woodwind();
            case 2:
                return new Wind();
            case 3:
                return new Percussion();
            case 4:
                return new Stringed();
            case 5:
                return new Keyboard();
        }
    }
}
