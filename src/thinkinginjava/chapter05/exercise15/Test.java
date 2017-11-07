package thinkinginjava.chapter05.exercise15;

public class Test {

    String str;

    {
        str = "ABC";
        System.out.println("String initialized");
    }

    Test() {
        System.out.println("Test()");
    }

    void showString() {
        System.out.println(str);
    }
}
