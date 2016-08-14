package thinkinginjava.chapter03.exercise09;

/*
 * Chapter 3. Exercise 9. Difficult - 1/10.
 *
 * Start with a number that is all binary ones. Left shift it, then use the unsigned right-shift operator to
 * right shift through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
 */

public class Main {

    public static void main(String[] args) {
        double dMax = Double.MAX_VALUE;
        double dMin = Double.MIN_VALUE;
        float fMax = Float.MAX_VALUE;
        float fMin = Float.MIN_VALUE;

        System.out.println("dMax = " + dMax);   // Out: dMax = 1.7976931348623157E308
        System.out.println("dMin = " + dMin);   // Out: dMin = 4.9E-324
        System.out.println("fMax = " + fMax);   // Out: fMax = 3.4028235E38
        System.out.println("fMin = " + fMin);   // Out: fMin = 1.4E-45
    }
}
