package ucab.desarrollo.diagnostico.factories;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.api.Shape;
import ucab.desarrollo.diagnostico.game.Piece;

/**
 * A placeable Factory
 */
public class PlaceableFactory {
    protected PlaceableFactory() {}

    /**
     * Product maker.
     * @param shape the shape of the placeable
     * @return a newly created placeable
     */
    public static Placeable createPlaceable(Shape shape) {
        return new Piece(shape);
    }
}
