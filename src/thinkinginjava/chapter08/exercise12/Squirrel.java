package thinkinginjava.chapter08.exercise12;

class Squirrel extends Rodent {

    private Characteristic characteristic =
        new Characteristic("Squirrel");

    private Description description =
        new Description("Squirrel");

    Squirrel() {
        System.out.println("Squirrel()");
    }

    @Override
    void feed() {
        System.out.println("Squirrel.feed");
    }

    @Override
    void sleep() {
        System.out.println("Squirrel.sleep");
    }

    @Override
    void dispose() {
        System.out.println("Squirrel.dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}
