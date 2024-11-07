package Complementos;

public class Fanta extends Bebida {
    /**
     * Metodo que simula el consumo de una bebida Fanta.
     * @param serie el número de serie único
     * */
    public Fanta(int serie) {
        super(serie);
    }
    /**
     * @return retorna un String que indica que se ha consumido la bebida
     */
    public String consumir() {
        return "glupglup Fanta";
    }
}
