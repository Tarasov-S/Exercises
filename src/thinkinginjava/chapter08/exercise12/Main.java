package thinkinginjava.chapter08.exercise12;

/*
 * Chapter 8. Exercise 12. Difficult - 3/10.
 *
 * Modify Exercise 9 so that it demonstrates the order of initialization of the base classes
 * and derived classes. Now add member objects to both the base and derived classes and show the order
 * in which their initialization occurs during construction.
 */

public class Main {

    public static void main(String[] args) {

        Rat rat = new Rat();
        System.out.println("- - - - - - - - - - -");

        Beaver beaver = new Beaver();
        System.out.println("- - - - - - - - - - -");

        Hamster hamster = new Hamster();
        System.out.println("- - - - - - - - - - -");

        Squirrel squirrel = new Squirrel();
        System.out.println("=====================");

        Rodent[] rodents = {rat, beaver, hamster, squirrel};
        for (Rodent rodent : rodents) {
            rodent.dispose();
            System.out.println("- - - - - - - - - - -");
        }
    }
}

/*
 * Out:
 *
 * Characteristic("Rodent")
 * Description("Rodent")
 * Rodent()
 * Characteristic("Rat")
 * Description("Rat")
 * Rat()
 * - - - - - - - - - - -
 * Characteristic("Rodent")
 * Description("Rodent")
 * Rodent()
 * Characteristic("Beaver")
 * Description("Beaver")
 * Beaver()
 * - - - - - - - - - - -
 * Characteristic("Rodent")
 * Description("Rodent")
 * Rodent()
 * Characteristic("Hamster")
 * Description("Hamster")
 * Hamster()
 * - - - - - - - - - - -
 * Characteristic("Rodent")
 * Description("Rodent")
 * Rodent()
 * Characteristic("Squirrel")
 * Description("Squirrel")
 * Squirrel()
 * =====================
 * Rat.dispose
 * Description.dispose : Rat
 * Characteristic.dispose : Rat
 * Rodent.dispose
 * Description.dispose : Rodent
 * Characteristic.dispose : Rodent
 * - - - - - - - - - - -
 * Beaver.dispose
 * Description.dispose : Beaver
 * Characteristic.dispose : Beaver
 * Rodent.dispose
 * Description.dispose : Rodent
 * Characteristic.dispose : Rodent
 * - - - - - - - - - - -
 * Hamster.dispose
 * Description.dispose : Hamster
 * Characteristic.dispose : Hamster
 * Rodent.dispose
 * Description.dispose : Rodent
 * Characteristic.dispose : Rodent
 * - - - - - - - - - - -
 * Squirrel.dispose
 * Description.dispose : Squirrel
 * Characteristic.dispose : Squirrel
 * Rodent.dispose
 * Description.dispose : Rodent
 * Characteristic.dispose : Rodent
 * - - - - - - - - - - -
 *
 *
 */
