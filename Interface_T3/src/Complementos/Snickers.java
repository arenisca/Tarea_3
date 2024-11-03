package Complementos;

public class Snickers extends Dulce {

    /**
     * @param serie el número de serie único
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     * Método que simula el consumo de los Snickers
     * @return una cadena que describe el consumo
     */
    @Override
    public String consumir() {
        return "ñam Snickers";
    }
}
