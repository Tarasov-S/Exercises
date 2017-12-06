package thinkinginjava.chapter08.exercise07;

class Percussion extends Instrument {

    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "[Percussion]";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
