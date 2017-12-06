package thinkinginjava.chapter08.exercise05;

/*
 * Chapter 8. Exercise 5. Difficult - 1/10.
 *
 * Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
 * Modify ride( ) to call wheels( ) and verify that polymorphism works.
 */

public class Main {

    public static void main(String[] args) {

        drive(new Unicycle());
        drive(new Bicycle());
        drive(new Tricycle());
        drive(new Cycle());
    }

    private static void drive(Cycle cycle) {
        cycle.ride();
        cycle.wheels();
        System.out.println();
    }
}

/*
 * Out:
 *
 * Unicycle.ride
 * Wheels: 1
 *
 * Bicycle.ride
 * Wheels: 2
 *
 * Tricycle.ride
 * Wheels: 3
 *
 * Cycle.ride
 * Wheels:
 *
 */
