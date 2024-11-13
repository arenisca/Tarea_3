package Controladores.BotonesMonedas;

import Complementos.Moneda;
import Complementos.Moneda500;
import Controladores.Jpanels.JPanelBilletera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Objects;

public class BotonM500 extends JButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private Image M500;
    private int contador=123;
    public BotonM500(JPanelBilletera panelBilletera){
        super();
        this.addMouseListener(this);
        URL urlM500 = getClass().getClassLoader().getResource("moneda500.png");
        ImageIcon m500 = new ImageIcon(new ImageIcon(urlM500).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        this.setIcon(m500);
        this.setSelectedIcon(m500);
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
        Moneda m = new Moneda500(contador);
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
