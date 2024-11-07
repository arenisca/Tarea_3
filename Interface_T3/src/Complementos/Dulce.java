package Complementos;

public abstract class Dulce extends Producto {
    /**
     * Subclase abstracta {@code Dulce} que representa un producto de tipo dulce.
     * Hereda de la Superclase {@code Producto}, por lo que todos los dulces tienen un número
     * de serie que es asignado al ser creados.
     *
     * @param serie el número de serie único de cada dulce
     */
    public Dulce(int serie) {
        super(serie);
    }
}

