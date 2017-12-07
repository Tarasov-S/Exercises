package thinkinginjava.chapter08.exercise12;

class Beaver extends Rodent {

    private Characteristic characteristic =
        new Characteristic("Beaver");
    private Description description =
        new Description("Beaver");

    Beaver() {
        System.out.println("Beaver()");
    }

    @Override
    void feed() {
        System.out.println("Beaver.feed");
    }

    @Override
    void sleep() {
        System.out.println("Beaver.sleep");
    }

    @Override
    void dispose() {
        System.out.println("Beaver.dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
