package Controladores.BotonesProductos;

import Complementos.Seleccionador;
import Controladores.Jpanels.JPanelSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Objects;

public class BotonFanta extends JRadioButton implements MouseListener {
    private JPanelSelect panelSelect;
    private ImageIcon fanta;
    private ImageIcon fanta_selecto;
    public BotonFanta(JPanelSelect panelSelect) {
        super("Valor: $1200");
        /** Esta forma de representar los iconos de los productos fue hecha gracias a Chat GPT
         * utilizando la pregunta ¿Cómo puedo poner una imagen .png y modificar su tamaño para
         * que aparezca con una escala de 80x80 px?
         * {@code Image.SCALE_SMOOTH} suaviza la escala, lo cual mejora la calidad de la
         *                            imagen en el nuevo tamaño.
         * {@code getScaledInstance} Se utiliza para escalar una imagen según la necesidad.
         * */
        URL urlfanta = getClass().getClassLoader().getResource("fanta.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("fanta_check.png");
        ImageIcon fanta = new ImageIcon(new ImageIcon(urlfanta).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));
        ImageIcon fanta_selecto = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT));

        this.setIcon(fanta);
        this.setSelectedIcon(fanta_selecto);
        this.addMouseListener(this);
        this.panelSelect = panelSelect;
        setBackground(new Color(0,255,255)); // nota! Editar color a gusto!!

    }
    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        panelSelect.setTipoProducto(Seleccionador.FANTA);
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