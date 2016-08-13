package thinkinginjava.chapter03.exercise06;

/*
 * Chapter 3. Exercise 6. Difficult - 3/10.
 *
 * Following Exercise 5, create a new Dog reference and assign it to spot’s object. Test for comparison
 * using == and equals( ) for all references.
 */

public class Main {

    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "Ruff!");
        Dog belka = new Dog("Belka", "Uff!");

        spot = belka;
        System.out.println(spot == belka);  // out: true
    }
}
