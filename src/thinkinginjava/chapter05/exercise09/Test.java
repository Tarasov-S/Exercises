package thinkinginjava.chapter05.exercise09;

class Test {

    private String str;

    Test(String str) {
        this.str = str;
    }

    Test() {
        this("nothing");
    }

    void printStr() {
        System.out.println(str);
    }
}
