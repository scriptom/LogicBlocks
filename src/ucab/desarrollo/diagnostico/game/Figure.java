package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.List;
import java.util.Map;

/**
 * A conglomerate graph of placeable items, like {@link Piece}
 */
public class Figure extends UnidirectionalGraph<Placeable> {
    public Figure(Map<Vertex<Placeable>, List<Vertex<Placeable>>> adjacentVertices) {
        super(adjacentVertices);
    }
}
