package thinkinginjava.chapter06.exercise07.access;

public class Widget {

    private String msg;

    public Widget(String msg) {
        this.msg = msg;
    }

    public void action() {
        print(msg);
    }

    private void print(String string) {
        System.out.println(string);
    }
}
