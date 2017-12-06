package thinkinginjava.chapter08.exercise05;

class Tricycle extends Cycle {

    private static final int WHEELS = 3;

    void ride() {
        System.out.println("Tricycle.ride");
    }

    @Override
    void wheels() {
        super.wheels();
        System.out.println(WHEELS);
    }
}
