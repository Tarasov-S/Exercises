package thinkinginjava.chapter07.exercise24;

public class Cockroach extends Beetle {

    private static int x3 = printInit("static Cockroach.x3 initialized");
    private int l = printInit("Cockroach.l initialized");

    Cockroach() {
        System.out.println("x3 = " + x3);
        System.out.println("l = " + l);
        System.out.println("j = " + j);

    }
}
