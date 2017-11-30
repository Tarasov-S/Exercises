package thinkinginjava.chapter07.exercise12;

public class Root {

    Component1 c1;
    Component2 c2;
    Component3 c3;

    public Root() {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Root()");
    }

    void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}
