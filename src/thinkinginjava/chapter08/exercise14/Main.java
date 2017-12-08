package thinkinginjava.chapter08.exercise14;

/*
 * Chapter 8. Exercise 14. Difficult - 4/10.
 *
 * Modify Exercise 12 so that one of the member objects is a shared object with reference counting,
 * and demonstrate that it works properly.
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SharedDescription description = new SharedDescription("Mammal");

        Rat rat = new Rat(new SharedDescriptionHolder(description));
        System.out.println("- - - - - - - - - - -");

        Beaver beaver = new Beaver(new SharedDescriptionHolder(description));
        System.out.println("- - - - - - - - - - -");

        Hamster hamster = new Hamster(new SharedDescriptionHolder(description));
        System.out.println("- - - - - - - - - - -");

        Squirrel squirrel = new Squirrel(new SharedDescriptionHolder(description));
        System.out.println("=====================");

        Rodent[] rodents = {rat, beaver, hamster, squirrel};
        for (Rodent rodent : rodents) {
            rodent.dispose();
            System.out.println("- - - - - - - - - - -");
        }

        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = null;
        }
        description = null;

        rat = null;
        beaver = null;
        hamster = null;
        squirrel = null;

        System.out.println("GC");

        System.gc();
    }
}

/*
 * Out:
 *
 * SharedDescription#0 : Mammal
 * Create: Holder#0
 * Characteristic("Rodent")
 * Rodent()
 * Characteristic("Rat")
 * Rat()
 * - - - - - - - - - - -
 * Create: Holder#1
 * Characteristic("Rodent")
 * Rodent()
 * Characteristic("Beaver")
 * Beaver()
 * - - - - - - - - - - -
 * Create: Holder#2
 * Characteristic("Rodent")
 * Rodent()
 * Characteristic("Hamster")
 * Hamster()
 * - - - - - - - - - - -
 * Create: Holder#3
 * Characteristic("Rodent")
 * Rodent()
 * Characteristic("Squirrel")
 * Squirrel()
 * =====================
 * Rat.dispose
 * Characteristic.dispose : Rat
 * Rodent.dispose
 * Characteristic.dispose : Rodent
 * dispose: Holder#0
 * - - - - - - - - - - -
 * Beaver.dispose
 * Characteristic.dispose : Beaver
 * Rodent.dispose
 * Characteristic.dispose : Rodent
 * dispose: Holder#1
 * - - - - - - - - - - -
 * Hamster.dispose
 * Characteristic.dispose : Hamster
 * Rodent.dispose
 * Characteristic.dispose : Rodent
 * dispose: Holder#2
 * - - - - - - - - - - -
 * Squirrel.dispose
 * Characteristic.dispose : Squirrel
 * Rodent.dispose
 * Characteristic.dispose : Rodent
 * dispose: Holder#3
 * Dispose : SharedDescription#0
 * - - - - - - - - - - -
 * GC
 * OK : Finalize Holder#3
 * OK : Finalize Holder#2
 * OK : Finalize Holder#1
 * OK : Finalize Holder#0
 * OK : Finalize SharedDescription#0
 *
 */
