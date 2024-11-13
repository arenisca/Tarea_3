package Controladores.BotonesMonedas;

import Complementos.Moneda;
import Complementos.Moneda2000;
import Controladores.Jpanels.JPanelBilletera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Objects;

public class BotonM2000 extends JButton implements MouseListener {
    private JPanelBilletera panelBilletera;
    private Image M2000;
    private int contador = 123;

    public BotonM2000(JPanelBilletera panelBilletera) {
        super();
        this.addMouseListener(this);
        URL urlM2000 = getClass().getClassLoader().getResource("moneda2000.jpg");
        ImageIcon m2000 = new ImageIcon(new ImageIcon(urlM2000).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        this.setIcon(m2000);
        this.setSelectedIcon(m2000);
        this.panelBilletera = panelBilletera;
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Moneda m = new Moneda2000(contador);
        panelBilletera.setTipoMoneda(m);
        contador = contador + 1;
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