package ucab.desarrollo.diagnostico.factories;

import ucab.desarrollo.diagnostico.api.Placeable;
import ucab.desarrollo.diagnostico.api.Shape;
import ucab.desarrollo.diagnostico.api.Space;
import ucab.desarrollo.diagnostico.enums.GraphPurpose;
import ucab.desarrollo.diagnostico.game.*;
import ucab.desarrollo.diagnostico.structures.api.Graph;
import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Static factory for Graphs, which handles creation of concrete implementations of Graph abstractions.
 */
public class GraphFactory {
    private GraphFactory() {
    }

    /**
     * Returns a Graph implementation, depending on its purpose
     * @param purpose the purpose of the graph
     * @param size the number of vertices
     * @param shape the shape of all the vertices
     * @return a newly created graph
     */
    public static Graph<?> buildGraph(GraphPurpose purpose, int size, Shape shape) {
        switch (purpose) {
            case BOARD:
                return boardGraph(size, shape);
            case FIGURE:
                return figureGraph(size, shape);
        }

        return null;
    }

    private static Graph<Placeable> figureGraph(int size, Shape shape) {
        Map<Vertex<Placeable>, List<Vertex<Placeable>>> adjacent = new HashMap<>(size);
        Graph<Placeable> figure = new Figure(adjacent);
        // In theory, a bunch of vertices would be generated and linked.
        // In a perfect world, I would follow some sort of "Configuration" structure to know how to link
        // the vertices, but figure generation is none of my business :)
        return figure;
    }

    private static Graph<Space> boardGraph(int size, Shape shape) {
        Map<Vertex<Space>, List<Vertex<Space>>> adjacent = new HashMap<>(size);
        Graph<Space> board = new GameBoard(adjacent);
        // In theory, a bunch of vertices would be generated and linked.
        // In a perfect world, I would follow some sort of "Configuration" structure to know how to link
        // the vertices, but board generation is none of my business :)
        return board;
    }
}
