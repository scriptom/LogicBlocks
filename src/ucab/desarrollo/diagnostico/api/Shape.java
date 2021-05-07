package ucab.desarrollo.diagnostico.api;

/**
 * A Shape is an abstract concept that must have sides, at least 1.
 */
public interface Shape {
    /**
     * Get the number of sides of this shape. For example, a square would return 4, a triangle would return 3, etc.
     * @return the number of sides in the shape
     */
    int sideCount();
}
