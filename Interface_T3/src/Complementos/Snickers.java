package Complementos;

public class Snickers extends Dulce {
    /**
     * Esta subclase simula el consumo de un Snicker
     * @param serie el número de serie único
     */
    public Snickers(int serie) {
        super(serie);
    }
    /** @return retorna una cadena que indica el consumo del dulce */
    public String consumir() {
        return "ñam Snickers";
    }
}
