package thinkinginjava.chapter08.exercise14;

public class Characteristic {

    private String string;

    Characteristic(String string) {
        this.string = string;
        System.out.println("Characteristic(\"" + string + "\")");
    }

    void dispose() {
        System.out.println("Characteristic.dispose : " + string);
    }
}
