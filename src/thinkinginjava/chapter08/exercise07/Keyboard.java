package thinkinginjava.chapter08.exercise07;

public class Keyboard extends Instrument {

    void play(Note n) {
        System.out.println("Keyboard.play() " + n);
    }

    @Override
    public String toString() {
        return "[Keyboard]";
    }

    void adjust() {
        System.out.println("Adjusting Keyboard");
    }
}
