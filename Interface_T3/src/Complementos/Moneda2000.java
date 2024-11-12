package Complementos;

/**
 * La subclase {@code Moneda2000} representa una moneda de 2000 unidades.
 * Extiende la superclase abstracta {@code Moneda}
 * Implementa el método {@code getValor}.
 */
public class Moneda2000 extends Moneda{
    public Moneda2000(int i){
    }
    /** @return Valor de la moneda. */
    @Override
    public int getValor() {
        return 2000;
    }

}
