package thinkinginjava.chapter08.exercise05;

class Unicycle extends Cycle {

    private static final int WHEELS = 1;

    void ride() {
        System.out.println("Unicycle.ride");
    }

    @Override
    void wheels() {
        super.wheels();
        System.out.println(WHEELS);
    }
}
