package Complementos;

public class Cocacola extends Bebida {
    /**
     * Metodo que simula el consumo de la Cocacola.
     * @param serie el número de serie único
     * */
    public Cocacola(int serie) {
        super(serie);
    }
    /**
     * @return retorna un String que indica que se ha consumido la bebida
     */
    public String consumir() {
        return "glupglup Cocacola";
    }
}
