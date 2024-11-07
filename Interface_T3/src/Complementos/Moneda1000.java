package Complementos;

/**
 * La subclase {@code Moneda1000} representa una moneda de 1000 unidades.
 * Extiende la superclase abstracta {@code Moneda}
 * Implementa el método {@code getValor}.
 */
public class Moneda1000 extends Moneda {
    public Moneda1000() { }
    /**
     * @return el valor de la moneda, que es 1000
     */
    public int getValor() {
        return 1000;
    }
}
