package thinkinginjava.chapter07.exercise20;

public class B extends A {

    void privFinal(String s) {
        System.out.println("B.pfv(\"" + s + "\")");
    }

    void priv(String s) {
        System.out.println("B.pfv(\"" + s + "\")");
    }

//    @Override                     // Error: java: method does not override or implement a method from a supertype
//    void privFinal(String s) {
//    }
//
//    @Override                     // Error: java: method does not override or implement a method from a supertype
//    void priv(String s) {
//    }
}
