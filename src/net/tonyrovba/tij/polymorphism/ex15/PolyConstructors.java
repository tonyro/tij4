package net.tonyrovba.tij.polymorphism.ex15;

/**
 * Created with IntelliJ IDEA.
 * User: tonyr
 * Date: 07.08.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangleGlyph extends Glyph {
    private int smallSide = 1;
    private int largeSide = 2;

    public RectangleGlyph(int smallSide, int largeSide) {
        this.smallSide = smallSide;
        this.largeSide = largeSide;
        System.out.println("RectangleGlyph.RectangleGlyph(), small side = " + this.smallSide + ", large side = " + this.largeSide);
    }

    void draw() {
        System.out.println("RectangleGlyph.draw(), small side = " + this.smallSide + ", large side = " + this.largeSide);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangleGlyph(3, 8);
    }
}
