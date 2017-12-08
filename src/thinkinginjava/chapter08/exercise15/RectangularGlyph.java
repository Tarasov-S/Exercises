package thinkinginjava.chapter08.exercise15;

public class RectangularGlyph extends Glyph {

    private int radius = 2;

    public RectangularGlyph(int r) {
        radius = r;
        System.out.println("RectangularGlyph.RectangularGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}
