package ucab.desarrollo.diagnostico.structures.api;

import java.util.List;

/**
 * A Vertex which can be placed in a graph.
 * @param <T> The type contained in the Vertex instances.
 */
public interface Vertex<T> {
    /**
     * @param t the value contained in the vertex
     */
    void setValue(T t);

    /**
     * @return the value contained in te vertex
     */
    T getValue();

    /**
     * Links a vertex to this vertex
     * @param vertex vertex to be linked
     */
    void linkVertex(Vertex<T> vertex);

    /**
     * Unlinks a Vertex from this instance
     * @param vertex The vertex to be unlinked.
     */
    void unlinkVertex(Vertex<T> vertex);

    /**
     * Gets the list of adjacent vertices of the current instance
     * @return the linked vertices
     */
    List<Vertex<T>> getLinkedVertices();
}
