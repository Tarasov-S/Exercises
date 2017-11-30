package thinkinginjava.chapter07.exercise02;

/*
 * Chapter 7. Exercise 2. Difficult - 2/10.
 *
 * Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( )
 */

public class Disinfectant extends Detergent {

    public static void main(String[] args) {

        Disinfectant x = new Disinfectant();

        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();

        System.out.println(x);
        // Out: Cleanser dilute() apply() Disinfectant.scrub() Detergent.scrub() scrub() foam() sterilize()
    }

    @Override
    public void scrub() {
        append(" Disinfectant.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }
}
