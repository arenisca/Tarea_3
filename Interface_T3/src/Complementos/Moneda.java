package Complementos;

public abstract class Moneda implements Comparable<Moneda> {
    /**
     * @param serie es el número de serie único para la bebida
     * @param otraMoneda es una instancia de {@code Moneda}
     * @param getValor permite saber el valor de las monedas
     * @param compareTo permite comparar las monedas entre si al consultar el valor de
     *                  la moneda de la clase Moneda actual y otraMoneda de la clase
     *                  {@code Moneda} generada dentro del método {@code compareTo}.
     * */
    protected int serie;
    public Moneda() {    }
    public abstract int getValor();
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}