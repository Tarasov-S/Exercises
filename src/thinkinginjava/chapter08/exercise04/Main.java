package thinkinginjava.chapter08.exercise04;

/*
 * Chapter 8. Exercise 4. Difficult - 2/10.
 *
 * Add a new type of Shape to Shapes.java and verify in main( )
 * that polymorphism works for your new type as it does in the old types.
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
 * Circle.draw
 * Shape: OK
 *
 * Triangle.draw
 * Shape: OK
 *
 * Square.draw
 * Square: OK
 *
 * Rectangle.draw
 * Rectangle: OK
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
 */
