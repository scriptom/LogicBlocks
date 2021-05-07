package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Shape;
import ucab.desarrollo.diagnostico.api.Space;
import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * A badly named Vertex in the board. Has a shape and a Space which can be filled
 */
public class BoardSpace extends AbstractVertex<Space> {
    /**
     * The shape that describes this vertex
     */
    private Shape shape;
    public BoardSpace(List<Vertex<Space>> links, Shape shape) {
        super(links);
        this.shape = shape;
    }

    public BoardSpace(Shape shape) {
        this(new ArrayList<>(), shape);
    }
}
