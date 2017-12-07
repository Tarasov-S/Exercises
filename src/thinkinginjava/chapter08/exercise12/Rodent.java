package thinkinginjava.chapter08.exercise12;

public class Rodent {

    private Characteristic characteristic =
        new Characteristic("Rodent");

    private Description description =
        new Description("Rodent");

    public Rodent() {
        System.out.println("Rodent()");
    }

    void feed() {
        System.out.println("Rodent.feed");
    }

    void sleep() {
        System.out.println("Rodent.sleep");
    }

    void dispose() {
        System.out.println("Rodent.dispose");
        description.dispose();
        characteristic.dispose();
    }
}
