package thinkinginjava.chapter03.exercise09;

/*
 * Chapter 3. Exercise 9. Difficult - 1/10.
 *
 * Display the largest and smallest numbers for both float and double exponential notation.
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
