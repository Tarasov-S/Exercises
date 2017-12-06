package thinkinginjava.chapter08.exercise08;

class Brass extends Wind {

    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public String toString() {
        return "[Brass]";
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
