package thinkinginjava.chapter07.exercise24;

/*
 * Chapter 7. Exercise 24. Difficult - 2/10.
 *
 * In Beetle.java, inherit a specific type of beetle from class Beetle,
 * following the same format as the existing classes. Trace and explain the output.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Cockroach constructor");
        new Cockroach();
    }
}

/*
 * Out:
 *
 * Cockroach constructor
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * static Cockroach.x3 initialized
 * i = 9, j = 0
 * Beetle.k initialized
 * k = 47
 * j = 39
 * Cockroach.l initialized
 * x3 = 47
 * l = 47
 * j = 39
 *
 */
