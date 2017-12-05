package thinkinginjava.chapter08.exercise02;

/*
 * Chapter 8. Exercise 2. Difficult - 1/10.
 *
 * Add the @Override annotation to the shapes example.
 */

public class Main {

    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.nextShape();
        }

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

/*
 * Out:
 *
 * Circle.draw
 * Triangle.draw
 * Triangle.draw
 * Circle.draw
 * Triangle.draw
 * Square.draw
 * Circle.draw
 * Circle.draw
 * Square.draw
 */
