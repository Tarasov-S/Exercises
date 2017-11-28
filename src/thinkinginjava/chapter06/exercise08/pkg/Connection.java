package thinkinginjava.chapter06.exercise08.pkg;

public class Connection {

    private int id;
    private boolean isReady = true;

    private Connection(int id) {
        this.id = id;
        System.out.println(" -- new Connection #" + id);
    }

    static Connection createConnection(int id) {
        return new Connection(id);
    }

    public int getId() {
        return id;
    }

    public boolean isReady() {
        return isReady;
    }

    public void open() {
        isReady = false;
        System.out.println(" -- Connection #" + id + " open");
    }

    public void close() {
        isReady = true;
        System.out.println(" -- Connection #" + id + " closed");
    }
}
