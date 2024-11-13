package Controladores.Jpanels;

import Complementos.*;
import javax.swing.*;

public class JPanelCarrito extends JPanel {
    /**
     * Esta clase será nuestro carrito de compra. Aquí se añadirán
     * los productos que se vayan comprando.
     * {@code addProducto} es un método que añadirá los productos al carro.
     * En caso de añadir un mismo producto, se aumentará la cantidad de este.
     * @param producto corresponde al producto comprado y añadido al carrito.
     */
    int cantidadCocas = 0;
    int cantidadSprites = 0;
    int cantidadFantas = 0;
    int cantidadSnickers = 0;
    int cantidadSuper8s = 0;
    private JLabel nCocas;
    private JLabel nSprites;
    private JLabel nFantas;
    private JLabel nSnickers;
    private JLabel nSuper8s;

    public JPanelCarrito() {
        JLabel label = new JLabel("CARRITO COMPRA: ");
        nCocas = new JLabel("Cocas: 0");
        nSprites = new JLabel("Sprites: 0");
        nFantas = new JLabel("Fantas: 0");
        nSnickers = new JLabel("Snickers: 0");
        nSuper8s = new JLabel("Super8s: 0");
        add(label);
        add(nCocas);
        add(nSprites);
        add(nFantas);
        add(nSnickers);
        add(nSuper8s);
    }

    public void addProducto(Producto producto){
        if (producto instanceof Cocacola) {
            cantidadCocas++;
            nCocas.setText("Coca's: " + cantidadCocas);
        }
        else if (producto instanceof Fanta) {
            cantidadFantas++;
            nFantas.setText("Fanta's: " + cantidadFantas);
        }
        else if (producto instanceof Sprite) {
            cantidadSprites++;
            nSprites.setText("Sprite's: " + cantidadSprites);
        }
        else if (producto instanceof Snickers) {
            cantidadSnickers++;
            nSnickers.setText("Snickers: " + cantidadSnickers);
        }
        else if (producto instanceof Super8){
            cantidadSuper8s++;
            nSuper8s.setText("Super8's: " + cantidadSuper8s);
        }
    }
}