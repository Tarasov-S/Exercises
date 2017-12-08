package thinkinginjava.chapter08.exercise14;

class Beaver extends Rodent {

    private SharedDescriptionHolder holder;
    private Characteristic characteristic =
        new Characteristic("Beaver");

    Beaver(SharedDescriptionHolder holder) {
        super(holder);
        this.holder = holder;
        System.out.println("Beaver()");
    }

    @Override
    void dispose() {
        System.out.println("Beaver.dispose");
        characteristic.dispose();
        super.dispose();
    }
}
