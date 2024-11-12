package Controladores.Jpanels;

import Complementos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class DepositoCompra extends JPanel implements MouseListener {
    /**
     * Esta clase representa un panel con los productos comprados.
     * {@code setIcon} es un método que va a poner el icono del producto comprado
     * {@code paintComponent} pondrá la imagen del producto seleccionado.
     * {@code setProducto} recibe el producto que se compró y llama a setIcon y rePaint.
     * {@code mouseEntered} mostrará el número de serie del producto
     */
    private Producto producto;
    private ImageIcon icon;
    public DepositoCompra(){
        this.setPreferredSize(new Dimension(150, 150));
        this.addMouseListener(this);
        this.setBackground(Color.GRAY);

        setIcon();
    }

    private void setIcon() {
        if(producto == null) {
            icon = null;
        } else if (producto instanceof Cocacola) {
            icon = new ImageIcon(new ImageIcon("src/extras/coca.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Fanta) {
            icon = new ImageIcon(new ImageIcon("src/extras/fanta.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Sprite) {
            icon = new ImageIcon(new ImageIcon("src/extras/sprite.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Super8) {
            icon = new ImageIcon(new ImageIcon("src/extras/super8.png").getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        } else if(producto instanceof Snickers) {
            icon = new ImageIcon(new ImageIcon("src/extras/snickers.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(icon != null) {
            g.drawImage(icon.getImage(), 0, 0,getWidth(), getHeight(), this);
        }
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        setIcon();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setProducto(null);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(producto != null)
            JOptionPane.showMessageDialog(this, "N.ro serie: " + producto.getSerie());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
