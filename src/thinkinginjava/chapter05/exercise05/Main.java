package thinkinginjava.chapter05.exercise05;

/*
 * Chapter 5. Exercise 5. Difficult - 2/10.
 *
 * Create a class called Dog with an overloaded bark( ) method. This method should be overloaded based on various
 * primitive data types, and print different types of barking, howling, etc., depending on which overloaded
 * version is called. Write a main( ) that calls all the different versions.
 */

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        boolean bool = true;
        char c = 'A';
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;

        dog.bark();     // Out: Hello! I am a dog.

        dog.bark(true); // Out: I am a dog, I do not know what the boolean
        dog.bark('A');  // Out: I am a dog, I do not know what the char
        dog.bark(10);   // Out: I am a dog, I do not know what the int.
        dog.bark(10.0); // Out: I am a dog, I do not know what the double.


        dog.bark(bool); // Out: I am a dog, I do not know what the boolean
        dog.bark(c);    // Out: I am a dog, I do not know what the char
        dog.bark(b);    // Out: I am a dog, I do not know what the byte
        dog.bark(s);    // Out: I am a dog, I do not know what the short.
        dog.bark(i);    // Out: I am a dog, I do not know what the int.
        dog.bark(l);    // Out: I am a dog, I do not know what the long.
        dog.bark(f);    // Out: I am a dog, I do not know what the float.
        dog.bark(d);    // Out: I am a dog, I do not know what the double.
    }

}
