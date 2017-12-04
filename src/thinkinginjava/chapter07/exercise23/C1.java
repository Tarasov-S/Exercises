package thinkinginjava.chapter07.exercise23;

public class C1 extends B1 {

    static int x = Main.initInt("C1.x static", 555);
    int y = Main.initInt("C1.y non-static", 666);

    C1() {
        System.out.println("C1()");
    }
}
