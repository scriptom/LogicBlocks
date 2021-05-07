package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.structures.api.Graph;
import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Base implementation of Graph logic, Type agnostic. In this implementation, every vertex would be linked
 * once, and the order of linkage would matter.
 * @param <T> the type of instances contained in this graph's vertices
 */
public abstract class UnidirectionalGraph<T> implements Graph<T> {
    /**
     * Adjacent vertices table.
     */
    protected Map<Vertex<T>, List<Vertex<T>>> adjacentVerticesMap;

    public UnidirectionalGraph(Map<Vertex<T>, List<Vertex<T>>> adjacentVertices) {
        this.adjacentVerticesMap = adjacentVertices;
    }

    @Override
    public void addVertex(Vertex<T> vertex) {
        adjacentVerticesMap.put(vertex, new ArrayList<>());
    }

    @Override
    public void linkVertices(Vertex<T> v1, Vertex<T> v2) {
        v1.linkVertex(v2);
        adjacentVerticesMap.get(v1).add(v2);
    }

    @Override
    public void removeVertex(Vertex<T> vertex) {
        adjacentVerticesMap.values().forEach(adj -> adj.remove(vertex));
        adjacentVerticesMap.remove(vertex);
    }

    @Override
    public void unlinkVertices(Vertex<T> v1, Vertex<T> v2) {
        v1.unlinkVertex(v2);
        adjacentVerticesMap.get(v1).remove(v2);
    }

    @Override
    public int size() {
        return adjacentVerticesMap.size();
    }

    @Override
    public List<Vertex<T>> getAdjacentVertices(Vertex<T> vertex) {
        return adjacentVerticesMap.get(vertex);
    }

    @Override
    public Vertex<T> rootVertex() {
        return adjacentVerticesMap.keySet().stream().findFirst().orElseGet(() -> null);
    }
}
