package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.api.Space;
import ucab.desarrollo.diagnostico.structures.api.Graph;
import ucab.desarrollo.diagnostico.structures.api.GraphIterator;
import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.*;

/**
 * A graph of fillable spaces which can then be filled by a graph of {@link Placeable} instances.
 */
public class GameBoard extends UnidirectionalGraph<Space> {
    public GameBoard(Map<Vertex<Space>, List<Vertex<Space>>> adjacentVertices) {
        super(adjacentVertices);
    }


    /**
     * Inserts a {@link Graph} of {@link Placeable} into this graph, iteratively.
     *
     * @param pieces the graph to insert
     * @param root   A reference vertex present in this board, where the insertion would begin.
     * @return Whether it was possible to insert or not
     */
    public boolean insert(Graph<Placeable> pieces, Vertex<Space> root) {
        Iterator<Vertex<Placeable>> figureIterator = new GraphIterator<>(pieces, pieces.rootVertex());
        Iterator<Vertex<Space>> boardIterator = new GraphIterator<>(this, root);
        // We will first check that every piece really fits, before attempting to insert anything.
        // This would prevent rollbacking, at the expense of iterating twice.
        // After every piece has been confirmed to fit, then this map comes in useful.
        Map<Space, Placeable> placeableMap = new HashMap<>();
        while (figureIterator.hasNext()) {
            Vertex<Space> spaceVertex = boardIterator.next();
            // Fitting check.
            if (null == spaceVertex || !spaceVertex.getValue().isEmpty()) {
                return false;
            }

            // We map every space with a placeable.
            placeableMap.put(spaceVertex.getValue(), figureIterator.next().getValue());
        }
        // Actual insertion.
        placeableMap.forEach((Space::insert));
        return true;
    }
}
