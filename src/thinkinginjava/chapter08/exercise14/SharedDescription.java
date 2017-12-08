package thinkinginjava.chapter08.exercise14;

public class SharedDescription {

    private static long counter = 0;
    private final long id = counter++;

    private String string;
    private boolean disposed = false;
    private int refCount = 0;

    SharedDescription(String string) {
        this.string = string;
        System.out.println(this + " : " + string);
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "SharedDescription#" + id;
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
