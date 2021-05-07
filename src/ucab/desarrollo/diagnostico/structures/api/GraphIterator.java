package ucab.desarrollo.diagnostico.structures.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/**
 * Implementation of the iterator pattern for {@link Graph} and {@link Vertex}
 * @param <T> the type of instances contained in the Vertices instances
 * note: Never got it right. too late to fix tbh.
 */
public class GraphIterator<T> implements Iterator<Vertex<T>> {
    /**
     * The source Graph which is iterated
     */
    private Graph<T> source;
    /**
     * The stack of vertices pending to be iterated.
     */
    private Stack<Vertex<T>> pending;
    /**
     * Set of vertices already checked.
     */
    private Set<Vertex<T>> checked;
    /**
     * The current vertex in the iteration.
     */
    private Vertex<T> current;
    public GraphIterator(Graph<T> source, Vertex<T> initial) {
        this.source = source;
        current = initial;
        pending = new Stack<>();
        pending.addAll(initial.getLinkedVertices());
        checked = new HashSet<>(source.size());
    }

    @Override
    public boolean hasNext() {
        if (pending.isEmpty()) {
            pending.addAll(current.getLinkedVertices());
        }
        return !pending.isEmpty();
    }

    @Override
    public Vertex<T> next() {
       return pending.pop();
    }
}
