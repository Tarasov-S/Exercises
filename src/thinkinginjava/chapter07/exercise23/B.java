package thinkinginjava.chapter07.exercise23;

public class B extends A {

    static int x = Main.initInt("B.x static", 33);
    int y = Main.initInt("B.y non-static", 44);

    B() {
        System.out.println("B()");
    }
}
