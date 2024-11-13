package Controladores.Jpanels;

import Complementos.Moneda;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JPanelMonedas extends JPanel {
    /**
     * Esta clase nos permite añadir monedas al deposito tras una compra efectiva.
     * @param m es la moneda que irá al deposito de monedas.
     * {@code AñadirMonedasGrafica} permite añadir visualmente las monedas
     * */
    private ArrayList<Integer> monedas = new ArrayList<>();
    public JPanelMonedas(){
        setOpaque(false); setLayout(new FlowLayout(FlowLayout.CENTER, -25,10));
    }
    public void AñadirMonedasGrafica(Moneda m) {
        removeAll();
        monedas.add(m.getValor());
        Collections.sort(monedas);
        for(int i = 0 ; i < monedas.size() ; i++) {
            JLabel label = new JLabel();
            ImageIcon icon = null;
            if (monedas.get(i) == 100) {
                URL imagenURL = getClass().getClassLoader().getResource("moneda100.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            } else if (monedas.get(i) == 500) {
                URL imagenURL = getClass().getClassLoader().getResource("moneda500.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            } else if (monedas.get(i) == 1000) {
                URL imagenURL = getClass().getClassLoader().getResource("moneda100.jpg");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            } else if (monedas.get(i) == 2000) {
                URL imagenURL = getClass().getClassLoader().getResource("moneda2000.jpg");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            label.setIcon(icon);
            add(label);
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
