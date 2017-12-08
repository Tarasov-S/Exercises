package thinkinginjava.chapter08.exercise14;

class Squirrel extends Rodent {

    private SharedDescriptionHolder holder;
    private Characteristic characteristic =
        new Characteristic("Squirrel");

    Squirrel(SharedDescriptionHolder holder) {
        super(holder);
        this.holder = holder;
        System.out.println("Squirrel()");
    }

    @Override
    void dispose() {
        System.out.println("Squirrel.dispose");
        characteristic.dispose();
        super.dispose();
    }
}
