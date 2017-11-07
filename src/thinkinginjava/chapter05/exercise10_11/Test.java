package thinkinginjava.chapter05.exercise10_11;

public class Test {

    public void finalize() throws Throwable {

        System.out.print("Finalized");
        super.finalize();
    }
}
