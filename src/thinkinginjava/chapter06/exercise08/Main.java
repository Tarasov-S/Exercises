package thinkinginjava.chapter06.exercise08;

/*
 * Chapter 6. Exercise 8. Difficult - 4/10.
 *
 * Following the form of the example Lunch.java, create a class called ConnectionManager
 * that manages a fixed array of Connection objects.
 * The client programmer must not be able to explicitly create Connection objects,
 * but can only get them via a static method in ConnectionManager.
 * When the ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
 */

import thinkinginjava.chapter06.exercise08.pkg.Connection;
import thinkinginjava.chapter06.exercise08.pkg.ConnectionManager;

public class Main {

    public static void main(String[] args) {

        // Connection connection = new Connection(42);
        // Error: java: Connection(int) has private access in thinkinginjava.chapter06.exercise08.pkg.Connection

        // Connection connection = Connection.createConnection(42);
        // Error: java: createConnection(int) is not public in thinkinginjava.chapter06.exercise08.pkg.Connection;
        // cannot be accessed from outside package

        ConnectionManager manager = new ConnectionManager(3);

        System.out.println("---------------");

        Connection c01 = manager.getConnection();
        Connection c02 = manager.getConnection();
        Connection c03 = manager.getConnection();
        Connection с04 = manager.getConnection();
        Connection c05 = manager.getConnection();

        System.out.println("---------------");

        c01.close();
        c03.close();

        System.out.println("---------------");

        Connection c06 = manager.getConnection();
        Connection c07 = manager.getConnection();
        Connection c08 = manager.getConnection();
    }
}

/*
 * Out:
 *
 *  -- new Connection #0
 *  -- new Connection #1
 *  -- new Connection #2
 * ---------------
 * issued Connection #0
 *  -- Connection #0 open
 * issued Connection #1
 *  -- Connection #1 open
 * issued Connection #2
 *  -- Connection #2 open
 * Connections is out
 * Connections is out
 * ---------------
 *  -- Connection #0 closed
 *  -- Connection #2 closed
 * ---------------
 * issued Connection #0
 *  -- Connection #0 open
 * issued Connection #2
 *  -- Connection #2 open
 * Connections is out
 *
 */
