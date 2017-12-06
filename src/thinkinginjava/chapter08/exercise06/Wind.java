package thinkinginjava.chapter08.exercise06;

class Wind extends Instrument {

    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String toString() {
        return "[Wind]";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
