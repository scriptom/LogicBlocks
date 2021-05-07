package ucab.desarrollo.diagnostico.structures.api;

import java.util.List;

/**
 * A Graph contract. Network of vertices which may have one or more connections (links), between them.
 * @param <T>
 */
public interface Graph<T> {
    void addVertex(Vertex<T> vertex);
    void linkVertices(Vertex<T> v1, Vertex<T> v2);
    void removeVertex(Vertex<T> vertex);
    void unlinkVertices(Vertex<T> v1, Vertex<T> v2);
    List<Vertex<T>> getAdjacentVertices(Vertex<T> vertex);
    Vertex<T> rootVertex();
    int size();
}
