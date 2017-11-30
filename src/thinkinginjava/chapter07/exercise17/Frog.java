package thinkinginjava.chapter07.exercise17;

public class Frog extends Amphibian {

    void swim() {
        System.out.print("Frog ");
        super.swim();
    }

    void walk() {
        System.out.print("Frog ");
        super.walk();
    }

    void jump() {
        System.out.println("Frog Jump");
    }

    void croak() {
        System.out.println("Frog Croak");
    }
}
