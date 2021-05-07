package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Shape;

import java.util.List;

/**
 * A simple Geometric Shape
 */
public class GeometricShape implements Shape {
    /**
     * the number of sides this shape has
     */
    private int sides;

    public GeometricShape(int sides) {
        this.sides = sides;
    }

    public GeometricShape() {}

    @Override
    public int sideCount() {
        return sides;
    }
}
