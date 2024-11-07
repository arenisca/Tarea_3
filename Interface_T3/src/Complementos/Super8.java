package Complementos;

public class Super8 extends Dulce {
    /**
     * Esta subclase simula el consumo de un Super8
     * @param serie el número de serie único.
     */
    public Super8(int serie) {
        super(serie);
    }
    /** @return retorna una cadena que indica el consumo del dulce*/
    public String consumir() {
        return "ñam super8";
    }
}
