package thinkinginjava.chapter08.exercise03;

/*
 * Chapter 8. Exercise 3. Difficult - 1/10.
 *
 * Add a new method in the base class of Shapes.java that prints a message,
 * but don’t override it in the derived classes. Explain what happens.
 * Now override it in one of the derived classes but not the others, and see what happens.
 * Finally, override it in all the derived classes.
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
            shape.test();
            System.out.println();
        }
    }
}

/*
 * Out:
 *
 * Circle.draw
 * Shape: OK
 *
 * Triangle.draw
 * Shape: OK
 *
 * Triangle.draw
 * Shape: OK
 *
 * Circle.draw
 * Shape: OK
 *
 * Triangle.draw
 * Shape: OK
 *
 * Square.draw
 * Square: OK
 *
 * Circle.draw
 * Shape: OK
 *
 * Circle.draw
 * Shape: OK
 *
 * Square.draw
 * Square: OK
 */
