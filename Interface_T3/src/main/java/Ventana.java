import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

class Ventana extends JFrame { // como extiende a un JFrame, es un JFrame, pero con algunos agregados
    // propiedades que puedes agregar aquí para que compongan a Ventana. Ventana "es un" JFrame
    public Ventana(){
        super();
        this.setLayout(new BorderLayout()); // aunque tiene Layout por defecto, se define uno que es mas práctico
        MiPanel mp = new MiPanel();

        this.setTitle("Expendedora virtual de comida");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // permite que la X para cerrar la ventana esté habilitada para finalizar la ejecución
        this.setSize(1000,900);
        ImageIcon iconoExpendedora = new ImageIcon(this.getClass().getResource("/extras/Expendedora.png"));
        this.setIconImage(iconoExpendedora.getImage());
        this.setVisible(true); // Permite que la ventana sea visible
        this.setResizable(false); // Permite evitar que la ventana sea reajustada
        this.setLocationRelativeTo(null); //permite poner la ventana al centro de la pantalla
    }
}