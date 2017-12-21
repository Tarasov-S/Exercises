package thinkinginjava.chapter09.exercise01;

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
