package thinkinginjava.chapter06.exercise06;

/*
 * Chapter 6. Exercise 6. Difficult - 1/10.
 *
 * Create a class with protected data. Create a second class in the same file
 * with a method that manipulates the protected data in the first class.
 */

public class Main {

    public static void main(String[] args) {

        Test test = new Test();

        printData(test.data);           // Out: 0
        changeData(test, 42);
        printData(test.data);           // Out: 42
    }

    private static void changeData(Test test, int newData) {
        test.data = newData;
    }

    private static void printData(int data) {
        System.out.println(data);
    }
}


class Test {

    protected int data;
}
