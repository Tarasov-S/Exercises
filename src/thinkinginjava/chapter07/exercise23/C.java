package thinkinginjava.chapter07.exercise23;

public class C extends B {

    static int x = Main.initInt("C.x static", 55);
    int y = Main.initInt("C.y non-static", 66);

    C() {
        System.out.println("C()");
    }
}
