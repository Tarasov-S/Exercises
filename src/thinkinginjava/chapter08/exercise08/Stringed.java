package thinkinginjava.chapter08.exercise08;

class Stringed extends Instrument {

    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "[Stringed]";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
