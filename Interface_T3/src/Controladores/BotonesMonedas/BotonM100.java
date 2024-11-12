package Controladores.BotonesMonedas;

import Complementos.Moneda100;
import Complementos.Moneda;
import Controladores.Jpanels.JPanelBilletera;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;
import javax.swing.*;

public class BotonM100 extends JButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private Image M100;
    private int contador=123;
    public BotonM100(JPanelBilletera panelBilletera){
        super();
        this.addMouseListener(this);
        ImageIcon iconoM100 = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/extras/moneda100.png")));
        M100 = iconoM100.getImage();
        this.setIcon(iconoM100);
        this.setSelectedIcon(iconoM100);
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
        Moneda m = new Moneda100(contador);
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
