package thinkinginjava.chapter07.exercise23;

public class B1 extends A1 {

    static int x = Main.initInt("B1.x static", 333);
    int y = Main.initInt("B1.y non-static", 444);

    B1() {
        System.out.println("B1()");
    }
}
