package thinkinginjava.chapter05.exercise06;

/*
 * Chapter 5. Exercise 6. Difficult - 1/10.
 *
 * Modify the previous exercise so that two of the overloaded methods have two arguments (of two different types),
 * but in reversed order relative to each other. Verify that this works.
 */

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        char c = 'A';
        int i = 10;

        dog.bark();     // Out: Hello! I am a dog.
        dog.bark(c, i); // Out: Char first!
        dog.bark(i, c); // Out: Int first!

    }

}
