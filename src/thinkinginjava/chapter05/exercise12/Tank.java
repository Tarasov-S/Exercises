package thinkinginjava.chapter05.exercise12;

public class Tank {

    private int number;
    private boolean state = true;   // false - empty ; true - full ; full - not ready to be terminated.

    Tank(int number) {
        this.number = number;
    }

    void toEmpty() {
        this.state = false;
    }

    protected void finalize() throws Throwable {
        if (state) System.out.print("Warning! The non-empty Tank#" + number + " was destroyed.");
        super.finalize();
    }
}
