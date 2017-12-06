package thinkinginjava.chapter08.exercise11;

class Sandwich extends PortableLunch {

    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    private Pickle pikle = new Pickle();

    Sandwich() {
        System.out.println("Sandwich()");
    }
}
