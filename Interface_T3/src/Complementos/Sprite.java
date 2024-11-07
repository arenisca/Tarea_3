package Complementos;

public class Sprite extends Bebida {
    /**
     * Metodo que simula el consumo de una bebida Sprite.
     * @param serie el número de serie único
     * */
    public Sprite(int serie) {
        super(serie);
    }
    /**
     * @return retorna un String que indica que se ha consumido la bebida
     */
    public String consumir() {
        return "glupglup Sprite";
    }
}
