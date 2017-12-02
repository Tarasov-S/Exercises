package thinkinginjava.chapter07.exercise19;

public class A {

    public final int i;

    public A(int i) {
        this.i = i;
    }

    public A(int a, int b) {
        i = a + b;
    }

    public A() {
        this(11);
    }

    // public A(boolean b) {
    // if(b) this.i = 22;   // Initialization is not guaranteed.
    // }
    // Error: java: variable i might not have been initialized
}
