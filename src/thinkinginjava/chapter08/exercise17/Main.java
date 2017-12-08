package thinkinginjava.chapter08.exercise17;

/*
 * Chapter 8. Exercise 17. Difficult - 2/10.
 *
 * Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle,
 * but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
 * Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( )
 * and observe what happens.
 */

public class Main {

    public static void main(String[] args) {

        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};

//        for (Cycle cycle : cycles) cycle.balance();
//        Error: java: cannot find symbol
//        symbol:   method balance()
//        location: variable cycle of type thinkinginjava.chapter08.exercise17.Cycle

        ((Unicycle) cycles[0]).balance();   // Out: Unicycle.balance
        ((Bicycle) cycles[1]).balance();    // Out: Bicycle.balance

//        ((Tricycle) cycles[2]).balance();
//        Error:(25, 31) java: cannot find symbol
//        symbol:   method balance()
//        location: class thinkinginjava.chapter08.exercise17.Tricycle

//        ((Bicycle) cycles[0]).balance();
//        Exception in thread "main" java.lang.ClassCastException:
//        thinkinginjava.chapter08.exercise17.Unicycle cannot be cast to
//        thinkinginjava.chapter08.exercise17.Bicycle

//        ((Unicycle) cycles[1]).balance();
//        Exception in thread "main" java.lang.ClassCastException:
//        thinkinginjava.chapter08.exercise17.Bicycle cannot be cast to
//        thinkinginjava.chapter08.exercise17.Unicycle
    }
}
