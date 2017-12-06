package thinkinginjava.chapter08.exercise09;

public class Hamster extends Rodent {

    @Override
    void feed() {
        System.out.println("Hamster.feed");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep");
    }
}
