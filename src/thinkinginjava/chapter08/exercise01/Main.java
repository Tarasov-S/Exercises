package thinkinginjava.chapter08.exercise01;

/*
 * Chapter 8. Exercise 1. Difficult - 2/10.
 *
 * Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 */

public class Main {

    public static void main(String[] args) {

        drive(new Unicycle());      // Out: Unicycle.ride
        drive(new Bicycle());       // Out: Bicycle.ride
        drive(new Tricycle());      // Out: Tricycle.ride
        drive(new Cycle());         // Out: Cycle.ride
    }

    private static void drive(Cycle cycle) {
        cycle.ride();
    }
}
