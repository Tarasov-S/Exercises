package thinkinginjava.chapter08.exercise09;

public class Rat extends Rodent {

    @Override
    void feed() {
        System.out.println("Rat.feed");
    }

    @Override
    void sleep() {
        System.out.println("Rat.sleep");
    }
}
