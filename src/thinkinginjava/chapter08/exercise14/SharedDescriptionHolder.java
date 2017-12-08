package thinkinginjava.chapter08.exercise14;

public class SharedDescriptionHolder {

    private static long counter = 0;
    private final long id = counter++;

    private SharedDescription description;
    private boolean disposed = false;

    SharedDescriptionHolder(SharedDescription description) {
        this.description = description;
        System.out.println("Create: " + this);
        this.description = description;
        this.description.addRef();
    }

    public String getDescription() {
        return description.getString();
    }

    @Override
    public String toString() {
        return "Holder#" + id;
    }

    void dispose() {
        disposed = true;
        System.out.println("dispose: " + this);
        description.dispose();
    }

    protected void finalize() throws Throwable {
        if (disposed) {
            System.out.println("OK : Finalize " + this);
        } else {
            System.out.println("Warning! : Finalize " + this);
        }
    }
}
