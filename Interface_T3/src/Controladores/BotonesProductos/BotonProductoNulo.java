package Controladores.BotonesProductos;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * El siguiente código fue creado gracias al uso de chatGPT.
 * Dado que necesito 6 botones y se me ha ocurrido usar el último como
 * un botón de producto nulo (agotado) */
public class BotonProductoNulo extends JButton implements ActionListener {

    public BotonProductoNulo() {
        super("Producto no disponible");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Muestra un mensaje que indica que no hay producto
        JOptionPane.showMessageDialog(this, "Este producto no está disponible en este momento.", "Producto no disponible", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Botón Producto Nulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        BotonProductoNulo botonNulo = new BotonProductoNulo();
        frame.add(botonNulo);

        frame.setVisible(true);
    }
}

