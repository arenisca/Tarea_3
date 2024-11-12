package Controladores.Jpanels;
import Complementos.Moneda;
import Controladores.BotonesMonedas.*;

import javax.swing.*;
import java.awt.*;

public class JPanelBilletera extends JPanel {
    /** Esta es la clase que va a representar los botones de cada moneda */
    private BotonM100 b100;
    private BotonM500 b500;
    private BotonM1000 b1000;
    private BotonM2000 b2000;
    private Moneda moneda;
    public JPanelBilletera(){
        b100 = new BotonM100(this);
        b500 = new BotonM500(this);
        b1000 = new BotonM1000(this);
        b2000 = new BotonM2000(this);
        ButtonGroup monedas = new ButtonGroup();
        setLayout(new GridLayout(2,2));
        monedas.add(b100);
        monedas.add(b500);
        monedas.add(b1000);
        monedas.add(b2000);
    }
    /**
     * {@code setTipoMoneda} guarda la moneda seleccionada
     * Luego {@code getMoneda} retorna la moneda seleccionada */
    public void setTipoMoneda(Moneda m) {this.moneda=m;}
    public Moneda getMoneda(){return this.moneda;}
}
