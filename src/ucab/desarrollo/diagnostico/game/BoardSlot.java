package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.api.Shape;
import ucab.desarrollo.diagnostico.api.Space;

/**
 * A free slot in the board, which could be filled
 */
public class BoardSlot implements Space {
    /**
     * The shape of the slot
     */
    private Shape shape;
    /**
     * The value contained in the slot, if any.
     */
    private Placeable value;

    @Override
    public void insert(Placeable placeable) {
        value = placeable;
    }

    @Override
    public void clear() {
        value = null;
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public boolean isEmpty() {
        return value == null;
    }
}
