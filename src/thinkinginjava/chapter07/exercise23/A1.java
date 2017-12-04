package thinkinginjava.chapter07.exercise23;

public class A1 {

    static int x = Main.initInt("A1.x static", 111);
    int y = Main.initInt("A1.y non-static", 222);

    A1() {
        System.out.println("A1()");
    }
}
