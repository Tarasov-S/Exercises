package thinkinginjava.chapter06.exercise05;

/*
 * Chapter 6. Exercise 5. Difficult - 2/10.
 *
 * Create a class with public, private, protected, and package-access fields and method members.
 * Create an object of this class and see what kind of compiler messages you get
 * when you try to access all the class members.
 * Be aware that classes in the same directory are part of the “default” package.
 */

import thinkinginjava.chapter06.exercise05.pkg.Test2;

public class Main {

    public static void main(String[] args) {

        Test1 test1 = new Test1();

        System.out.println(test1.publicString);         // Out: public
        System.out.println(test1.packageString);        // Out: package-access
        System.out.println(test1.protectedString);      // Out: protected
        // System.out.println(test1.privateString);
        // Error: java: privateString has private access in thinkinginjava.chapter06.exercise05.Test1

        test1.publicMethod();       // Out: public
        test1.defaultMethod();      // Out: package-access
        test1.protectedMethod();    // Out: protected
        // test1.privateMethod();
        // Error: java: privateMethod() has private access in thinkinginjava.chapter06.exercise05.Test1


        Test2 test2 = new Test2();

        System.out.println(test2.publicString);         // Out: public

        // System.out.println(test2.packageString);
        // Error: java: packageString is not public in thinkinginjava.chapter06.exercise05.pkg.Test2;
        // cannot be accessed from outside package

        // System.out.println(test2.protectedString);
        // Error: java: protectedString has protected access in thinkinginjava.chapter06.exercise05.pkg.Test2

        // System.out.println(test2.privateString);
        // Error: java: privateString has private access in thinkinginjava.chapter06.exercise05.pkg.Test2


        test2.publicMethod();       // Out: public

        // test2.defaultMethod();
        // Error: java: defaultMethod() is not public in thinkinginjava.chapter06.exercise05.pkg.Test2;
        // cannot be accessed from outside package

        // test2.protectedMethod();
        // Error: java: protectedMethod() has protected access in thinkinginjava.chapter06.exercise05.pkg.Test2

        // test2.privateMethod();
        // Error: java: privateMethod() has private access in thinkinginjava.chapter06.exercise05.pkg.Test2
    }
}
