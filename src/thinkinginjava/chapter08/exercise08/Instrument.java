package thinkinginjava.chapter08.exercise08;

class Instrument {

    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "[Instrument]";
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
