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
        x.detergentScrub();
        x.detergentFoam();
        System.out.println(x);  // Out: Cleanser dilute() apply() scrub() Detergent.scrub() Detergent.foam()
    }

    void detergentFoam() {
        append(detergent.foam());
    }

    void detergentScrub() {
        append(detergent.scrub());
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
    }

    public String toString() {
        return s;
    }
}
