package ucab.desarrollo.diagnostico.game;

import ucab.desarrollo.diagnostico.structures.api.Vertex;

import java.util.List;

/**
 * Base implementation of Vertex contract, which is type agnostic.
 * @param <T> the type of the contained objects in the vertex
 */
public abstract class AbstractVertex<T> implements Vertex<T> {
    protected List<Vertex<T>> links;
    protected T value;
    public AbstractVertex(List<Vertex<T>> links) {
        this.links = links;
    }

    @Override
    public void setValue(T t) {
        value = t;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void linkVertex(Vertex<T> vertex) {
        links.add(vertex);
    }

    @Override
    public void unlinkVertex(Vertex<T> vertex) {
        links.remove(vertex);
    }

    @Override
    public List<Vertex<T>> getLinkedVertices() {
        return links;
    }
}
