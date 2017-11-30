package thinkinginjava.chapter07.exercise10;

public class Root {

    Component1 c1 = new Component1(11);
    Component2 c2 = new Component2(22);
    Component3 c3 = new Component3(33);

    public Root(int i) {
        System.out.println("Root() received " + i);
    }
}
