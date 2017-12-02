package thinkinginjava.chapter07.exercise18;

import java.util.Random;

public class A {

    Random random = new Random();

    public final int f1 = 11;
    public final int f2 = random.nextInt();
    public final int f3;
    public final int f4;

    public static final int SF_1 = 22;

    // public static final int SF_2 = random.nextInt();
    // Error: java: non-static variable random cannot be referenced from a static context

    // public static final int SF_3;
    // public static final int SF_4;

    public A() {
        f3 = 33;
        f4 = random.nextInt();

        // SF_3 = 44;                 // Error: java: cannot assign a value to final variable SF_3
        // SF_4 = random.nextInt();   // Error: java: cannot assign a value to final variable SF_4
    }
}
