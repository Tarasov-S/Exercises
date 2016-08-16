package thinkinginjava.chapter03.exercise14;

/*
 * Chapter 3. Exercise 14. Difficult - 3/10.
 *
 * Write a method that takes two String arguments and uses all the boolean comparisons to compare the two
 * Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your
 * method with some different String objects.
 */

public class Main {

    public static void main(String[] args) {
        String s1, s2;

        compareString("ABC", "CBA");
        // Out: Compare: s1="ABC" and s2="CBA"
        // Out: s1.equals(s2) = false
        // Out: s1 == s2 = false


        compareString("ABC", "ABC");
        // Out: Compare: s1="ABC" and s2="ABC"
        // Out: s1.equals(s2) = true
        // Out: s1 == s2 = true


        s1 = "ABC";
        s2 = "ABC";
        compareString(s1, s2);
        // Out: Compare: s1="ABC" and s2="ABC"
        // Out: s1.equals(s2) = true
        // Out: s1 == s2 = true


        compareString(s1, "A" + "B" + "C");
        // Out: Compare: s1="ABC" and s2="ABC"
        // Out: s1.equals(s2) = true
        // Out: s1 == s2 = true


        s1 = new String("ABC");
        s2 = new String("ABC");
        compareString(s1, s2);
        // Out: Compare: s1="ABC" and s2="ABC"
        // Out: s1.equals(s2) = true
        // Out: s1 == s2 = false   (!!!)


    }

    private static void compareString(String s1, String s2) {
        System.out.println("Compare: s1=\"" + s1 + "\" and s2=\"" + s2 + "\"");
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println();
    }
}
