package thinkinginjava.chapter08.exercise14;

public class Rodent {

    private SharedDescriptionHolder holder;
    private Characteristic characteristic =
        new Characteristic("Rodent");

    public Rodent(SharedDescriptionHolder holder) {
        this.holder = holder;
        System.out.println("Rodent()");
    }

    void dispose() {
        System.out.println("Rodent.dispose");
        characteristic.dispose();
        holder.dispose();
    }
}
