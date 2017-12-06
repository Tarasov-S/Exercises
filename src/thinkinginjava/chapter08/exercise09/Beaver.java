package thinkinginjava.chapter08.exercise09;

public class Beaver extends Rodent {

    @Override
    void feed() {
        System.out.println("Beaver.feed");
    }

    @Override
    void sleep() {
        System.out.println("Beaver.sleep");
    }
}
