package Controladores.BotonesMonedas;

import Complementos.Moneda;
import Complementos.Moneda1000;
import Controladores.Jpanels.JPanelBilletera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class BotonM1000 extends JButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private Image M1000;
    private int contador=123;
    public BotonM1000(JPanelBilletera panelBilletera){
        super();
        this.addMouseListener(this);
        ImageIcon iconoM1000 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/extras/moneda1000.jpg")));
        M1000 = iconoM1000.getImage();
        this.setIcon(iconoM1000);
        this.setSelectedIcon(iconoM1000);
        this.panelBilletera =panelBilletera;
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Moneda m = new Moneda1000(contador);
        panelBilletera.setTipoMoneda(m);
        contador=contador+1;
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }

}