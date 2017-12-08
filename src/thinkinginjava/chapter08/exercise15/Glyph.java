package thinkinginjava.chapter08.exercise15;

class Glyph {

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }

    void draw() {
        System.out.println("Glyph.draw()");
    }
}
