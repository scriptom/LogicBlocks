package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.api.Shape;

/**
 * A single game piece that can be placed in the board.
 * It's described by a Shape and noting more
 */
public class Piece implements Placeable {
    private Shape shape;
    public Piece() {}
    public Piece(Shape shape) {
        this.shape = shape;
    }

    /**
     * @return the descriptor shape
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * @param shape The shape that describes this piece.
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
