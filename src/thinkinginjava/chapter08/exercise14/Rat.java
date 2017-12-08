package thinkinginjava.chapter08.exercise14;

public class Rat extends Rodent {

    private SharedDescriptionHolder holder;
    private Characteristic characteristic =
        new Characteristic("Rat");

    Rat(SharedDescriptionHolder holder) {
        super(holder);
        this.holder = holder;
        System.out.println("Rat()");
    }

    @Override
    void dispose() {
        System.out.println("Rat.dispose");
        characteristic.dispose();
        super.dispose();
    }
}
