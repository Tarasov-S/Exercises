package thinkinginjava.chapter08.exercise09;

public class Squirrel extends Rodent {

    @Override
    void feed() {
        System.out.println("Squirrel.feed");
    }

    @Override
    void sleep() {
        System.out.println("Squirrel.sleep");
    }
}
