package ucab.desarrollo.diagnostico.api;

/**
 * (Initially) Empty space, which can be filled with a {@link Placeable} instance, and cleared.
 * The space <b>must</b> have a shape for it to exist.
 */
public interface Space {
    /**
     * Fills the empty space, replacing existing objects.
     * @param placeable The object to fill this space with
     */
    void insert(Placeable placeable);

    /**
     * Clears this space, returning it to a fillable state
     */
    void clear();

    /**
     * @return the shape that describes this space.
     * note: it would've been smarter if I had added some checking to assert that the placeable shape
     * was equal to this space's shape, but it just hit me at 11:21 PM and I'm not up for it...
     */
    Shape getShape();

    /**
     * Determines whether this space is empty or not.
     * @return whether the space is empty or not.
     */
    boolean isEmpty();
}
