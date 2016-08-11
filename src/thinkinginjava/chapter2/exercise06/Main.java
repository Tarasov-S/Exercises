package thinkinginjava.chapter2.exercise06;

/*
 * Chapter 2. Exercise 6. Difficult - 2/10.
 *
 * Write a program that includes and calls the storage( ) method
 * defined as a code fragment in this chapter.
 */

public class Main {

    public static void main(String[] args) {
        StorageCalc calc = new StorageCalc();

        int size = calc.storage("The String");
        System.out.println(size + " bytes");    // out: 20 bytes
    }
}
