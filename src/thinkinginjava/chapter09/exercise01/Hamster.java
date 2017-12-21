package thinkinginjava.chapter09.exercise01;

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
