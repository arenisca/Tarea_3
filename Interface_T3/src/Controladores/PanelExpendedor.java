package Controladores;
import Complementos.Expendedor;
import Controladores.PanelDepositos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Objects;

public class PanelExpendedor extends JPanel implements MouseListener {
    private JPanelDepositos PanelDepositos;
    private Expendedor exp;
    private ImageIcon capadelantera;
    private Image capafondo;

    public PanelExpendedor(int tamaño) {
        this.exp = new Expendedor(tamaño);
        this.addMouseListener(this);
        ImageIcon iconoExpendedora = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/extras/Expendedora.png")));
        capafondo = iconoExpendedora.getImage();

        this.PanelDepositos = new JPanelDepositos(tamaño);
        Controladores.PanelDepositos.setPreferredSize(new Dimension(340,520));

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // se llama al paint de la super clase
        // se agrega la capa de fondo
        if (capafondo != null) {
            g.drawImage(capafondo, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
    public Expendedor getExpendedor() { return exp;}

    public JPanelDepositos getPanelDepositos() {
        return PanelDepositos;
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        PanelDepositos.llenarImagenes();
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
