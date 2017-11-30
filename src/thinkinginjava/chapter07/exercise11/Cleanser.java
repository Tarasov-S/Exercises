package thinkinginjava.chapter07.exercise11;

/*
 * Chapter 7. Exercise 11. Difficult - 3/10.
 *
 * Modify Detergent.java so that it uses delegation.
 */

class Cleanser {

    private String s = "Cleanser";

    private Detergent detergent = new Detergent();

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);  // Out: Cleanser dilute() apply() scrub() Detergent.scrub() Detergent.foam()
    }

    void foam() {
        append(detergent.foam());
    }

    void append(String a) {
        s += a;
    }

    void dilute() {
        append(" dilute()");
    }

    void apply() {
        append(" apply()");
    }

    void scrub() {
        append(" scrub()");
        append(detergent.scrub());
    }

    public String toString() {
        return s;
    }
}
