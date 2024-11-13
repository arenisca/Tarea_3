package Controladores;
import Complementos.Expendedor;
import Controladores.Jpanels.DepositoCompra;
import Controladores.Jpanels.JPanelDepositos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

import java.net.URL;
import java.util.Objects;

public class PanelExpendedor extends JPanel implements MouseListener {
    private JPanelDepositos panelDepositos;
    private Expendedor exp;
    private DepositoCompra depositoCompra;
    private ImageIcon iconExpendedora;
    private Image expendedora;

    public PanelExpendedor(int t) {
        super();
        this.exp = new Expendedor(t);
        this.addMouseListener(this);

        URL imagenUrl = getClass().getClassLoader().getResource("/src/extras/Expendedora.png");
        ImageIcon iconExpendedora = new ImageIcon(new ImageIcon(imagenUrl).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        expendedora = iconExpendedora.getImage();

        this.panelDepositos = new JPanelDepositos(t);
        panelDepositos.setPreferredSize(new Dimension(380,520));
        depositoCompra=new DepositoCompra();
        add(depositoCompra);
        add(panelDepositos);

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // se llama al paint de la super clase
        // se agrega la capa de fondo
        if (expendedora != null) {
            g.drawImage(expendedora, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
    public Expendedor getExpendedor() { return exp;}
    public DepositoCompra getDepositoCompra() { return depositoCompra;}
    public JPanelDepositos getPanelDepositos() { return panelDepositos; }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        panelDepositos.rellenarImagenes();
        exp.rellenarDepositos();
        updateUI();
    }

    /**
     * Invoked when a mouse button has been pressed on a component.
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
     * @param e the event to be processed
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     * @param e the event to be processed
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
