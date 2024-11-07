package Complementos;

public abstract class Producto {
    /**
     * Clase abstracta que representa un producto cualquiera.
     * Los productos se identifican por un número de serie, el cual es proporcionado
     * al momento de su creación.
     * @param Producto es un método que obtiene la serie del producto
     * @param serie es el número de serie único del producto
     * @param getSerie retorna la serie del producto
     *
     * El precio de los productos estarán almacenados en los enum
     */

    protected int serie;
    public Producto(int serie) { this.serie = serie; }
    /** @return el número de serie del producto */
    public int getSerie() {
        return serie;
    }
    public abstract String consumir();
}
