package thinkinginjava.chapter08.exercise14;

public class Hamster extends Rodent {

    private SharedDescriptionHolder holder;
    private Characteristic characteristic =
        new Characteristic("Hamster");

    public Hamster(SharedDescriptionHolder holder) {
        super(holder);
        this.holder = holder;
        System.out.println("Hamster()");
    }

    @Override
    void dispose() {
        System.out.println("Hamster.dispose");
        characteristic.dispose();
        super.dispose();
    }
}
