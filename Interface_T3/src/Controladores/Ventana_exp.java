package Controladores;

import javax.swing.*;
import java.awt.BorderLayout;

class Ventana_exp extends JFrame { // como extiende a un JFrame, es un JFrame, pero con algunos agregados
    public Ventana_exp(){
        //super();
        // propiedades que puedes agregar aquí para que compongan a Ventana. Ventana "es un" JFrame
        PanelPrincipal mipanel = new PanelPrincipal();
        add(mipanel);
        pack();
        //this.setLayout(new BorderLayout()); // aunque tiene Layout por defecto, se define uno que es mas práctico
        this.setTitle("Expendedora de comida");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // permite que la X para cerrar la ventana esté habilitada para finalizar la ejecución
        this.setVisible(true); // Permite que la ventana sea visible
        //this.setResizable(false); // Permite evitar que la ventana sea reajustada
        this.setLocationRelativeTo(null); //permite poner la ventana al centro de la pantalla
    }
}