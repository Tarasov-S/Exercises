package thinkinginjava.chapter08.exercise05;

class Bicycle extends Cycle {

    private static final int WHEELS = 2;

    void ride() {
        System.out.println("Bicycle.ride");
    }

    @Override
    void wheels() {
        super.wheels();
        System.out.println(WHEELS);
    }
}
