package thinkinginjava.chapter08.exercise12;

public class Rat extends Rodent {

    private Characteristic characteristic =
        new Characteristic("Rat");

    private Description description =
        new Description("Rat");

    Rat() {
        System.out.println("Rat()");
    }

    @Override
    void feed() {
        System.out.println("Rat.feed");
    }

    @Override
    void sleep() {
        System.out.println("Rat.sleep");
    }

    @Override
    void dispose() {
        System.out.println("Rat.dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
