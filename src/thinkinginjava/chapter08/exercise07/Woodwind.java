package thinkinginjava.chapter08.exercise07;

class Woodwind extends Wind {

    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "[Woodwind]";
    }
}
