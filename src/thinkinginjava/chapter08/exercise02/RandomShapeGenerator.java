package thinkinginjava.chapter08.exercise02;

import java.util.Random;

public class RandomShapeGenerator {

    private Random random = new Random(42);

    public Shape nextShape() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Triangle();
            case 1:
                return new Square();
            case 2:
                return new Circle();
        }
    }
}
