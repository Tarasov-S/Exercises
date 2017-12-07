package thinkinginjava.chapter08.exercise13;

public class Shared {

    private static long counter = 0;
    private final long id = counter++;
    private boolean disposed = false;
    private int refCount = 0;

    Shared() {
        System.out.println("Create: " + this);
    }

    @Override
    public String toString() {
        return "Shared#" + id;
    }

    public void addRef() {
        refCount++;
    }

    void dispose() {
        if (--refCount == 0) {
            disposed = true;
            System.out.println("Dispose : " + this);
        }
    }

    protected void finalize() throws Throwable {
        if (disposed) {
            System.out.println("OK : Finalize " + this);
        } else {
            System.out.println("Warning! : Finalize " + this);
        }
    }
}
