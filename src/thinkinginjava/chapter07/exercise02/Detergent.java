package thinkinginjava.chapter07.exercise02;

public class Detergent extends Cleanser {

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }
}