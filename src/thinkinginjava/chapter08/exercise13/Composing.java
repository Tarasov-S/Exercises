package thinkinginjava.chapter08.exercise13;

public class Composing {

    private static long counter = 0;
    private final long id = counter++;
    private boolean disposed = false;
    private Shared shared;

    Composing(Shared shared) {
        System.out.println("Create: " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    @Override
    public String toString() {
        return "Composing#" + id;
    }

    void dispose() {
        disposed = true;
        System.out.println("dispose: " + this);
        shared.dispose();
    }

    protected void finalize() throws Throwable {
        if (disposed) {
            System.out.println("OK : Finalize " + this);
        } else {
            System.out.println("Warning! : Finalize " + this);
        }
    }
}
