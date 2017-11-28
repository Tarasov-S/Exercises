package thinkinginjava.chapter06.exercise08.pkg;

public class ConnectionManager {

    private Connection[] connectionPool;

    public ConnectionManager(int sizeOfPool) {
        connectionPool = new Connection[sizeOfPool];
        for (int i = 0; i < connectionPool.length; i++) {
            connectionPool[i] = Connection.createConnection(i);
        }
    }


    public Connection getConnection() {
        for (Connection connection : connectionPool) {
            if (connection.isReady()) {
                System.out.println("issued Connection #" + connection.getId());
                connection.open();
                return connection;
            }
        }
        System.out.println("Connections is out");
        return null;
    }
}
