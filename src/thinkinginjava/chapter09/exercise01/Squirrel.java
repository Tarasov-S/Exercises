package thinkinginjava.chapter09.exercise01;

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
