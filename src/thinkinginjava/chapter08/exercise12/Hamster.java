package thinkinginjava.chapter08.exercise12;

public class Hamster extends Rodent {

    private Characteristic characteristic =
        new Characteristic("Hamster");
    private Description description =
        new Description("Hamster");

    public Hamster() {
        System.out.println("Hamster()");
    }

    @Override
    void feed() {
        System.out.println("Hamster.feed");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep");
    }

    @Override
    void dispose() {
        System.out.println("Hamster.dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
