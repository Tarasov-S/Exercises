package thinkinginjava.chapter07.exercise23;

public class A {

    static int x = Main.initInt("A.x static", 11);
    int y = Main.initInt("A.y non-static", 22);

    A() {
        System.out.println("A()");
    }
}
