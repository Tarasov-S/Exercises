package thinkinginjava.chapter08.exercise15;

/*
 * Chapter 8. Exercise 15. Difficult - 2/10.
 *
 * Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in this section.
 */

public class Main {

    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println("------------------------------");
        new RectangularGlyph(42);
    }
}

/*
 * Out:
 *
 * Glyph() before draw()
 * RoundGlyph.draw(), radius = 0
 * Glyph() after draw()
 * RoundGlyph.RoundGlyph(), radius = 5
 * ------------------------------
 * Glyph() before draw()
 * RectangularGlyph.draw(), radius = 0
 * Glyph() after draw()
 * RectangularGlyph.RectangularGlyph(), radius = 42
 *
 */
