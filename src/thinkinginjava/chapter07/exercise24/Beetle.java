package thinkinginjava.chapter07.exercise24;

public class Beetle extends Insect {

    private static int x2 = printInit("static Beetle.x2 initialized");
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
}
