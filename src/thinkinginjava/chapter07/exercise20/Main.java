package thinkinginjava.chapter07.exercise20;

/*
 * Chapter 7. Exercise 20. Difficult - 1/10.
 *
 * Show that @Override annotation solves the problem in this section.
 */


public class Main {

    public static void main(String[] args) {
        B b = new B();

        b.privFinal("ABC");     // Out: B.pfv("ABC")
        b.priv("DEF");          // Out: B.pfv("DEF")

        A a = new B();

        // a.privFinal("GHI");
        // Error: java: privFinal(java.lang.String) has private access in thinkinginjava.chapter07.exercise20.A

        // a.priv("KLM");
        // Error: java: privFinal(java.lang.String) has private access in thinkinginjava.chapter07.exercise20.A
    }
}
