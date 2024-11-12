package Controladores.ImagenProductos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImagenSuper8 extends JPanel {
    /**
     * Esta clase representa un componente de la imagen de CocaCola. Donde el método
     * {@code paintComponent} se encarga de pintar la imagen.*/
    private Image imagen;
    public ImagenSuper8() {
        setOpaque(false);
        URL imagenURL = getClass().getClassLoader().getResource("super8.png");
        try{
            imagen = ImageIO.read(imagenURL);
            int ancho = 70;
            int alto = 70;
            imagen = imagen.getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setPreferredSize(new Dimension(imagen.getWidth(null), imagen.getHeight(null)));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, this);
    }
}
