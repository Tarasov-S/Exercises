package thinkinginjava.chapter07.exercise19;

/*
 * Chapter 7. Exercise 19. Difficult - 2/10.
 *
 * Create a class with a blank final reference to an object.
 * Perform the initialization of the blank final inside all constructors.
 * Demonstrate the guarantee that the final must be initialized before use,
 * and that it cannot be changed once initialized.
 */

public class Main {

    public static void main(String[] args) {
        A a = new A();
    }
}
