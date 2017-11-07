package thinkinginjava.chapter05.exercise14;

public class Test {

    static String strA = "A";
    static String strB;

    static {
        strB = "B";
    }

    Test() {
        System.out.println("Test");
    }

    static void show() {
        System.out.println(strA);
        System.out.println(strB);
    }
}
