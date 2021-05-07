package ucab.desarrollo.diagnostico.factories;

import ucab.desarrollo.diagnostico.game.GeometricShape;
import ucab.desarrollo.diagnostico.api.Shape;

/**
 * A Factory for Shapes
 */
public class ShapeFactory {
    private ShapeFactory() {}

    /**
     * Constructs a shape based on a number of sides
     * @param numSides the number of sides the shape has
     * @return a newly created Shape.
     */
    public static Shape fromSides(int numSides) {
        return new GeometricShape(numSides);
    }
}
