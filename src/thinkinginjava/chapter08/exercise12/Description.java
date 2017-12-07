package thinkinginjava.chapter08.exercise12;

public class Description {

    private String string;

    public Description(String string) {
        this.string = string;
        System.out.println("Description(\"" + string + "\")");
    }

    void dispose() {
        System.out.println("Description.dispose : " + string);
    }
}
