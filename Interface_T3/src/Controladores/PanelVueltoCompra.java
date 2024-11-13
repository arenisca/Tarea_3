package Controladores;

import Complementos.Moneda;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class PanelVueltoCompra extends JPanel {
    private ArrayList<Moneda> monedas;
    public PanelVueltoCompra(){
        setOpaque(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, -50,10));
        monedas = new ArrayList<>();
    }
    public void RecibirVuelto(ArrayList<Moneda> monedasCompra) {
        removeAll();
        monedas.addAll(monedasCompra);
        Collections.sort(monedas, (Moneda m1, Moneda m2) -> m2.getValor() - m1.getValor());
        for(int i = 0 ; i < monedas.size() ; i++){
            JLabel label = new JLabel();
            ImageIcon icon = null;
            if(monedas.get(i).getValor() == 100){
                URL imagenURL = getClass().getClassLoader().getResource("moneda100.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i).getValor() == 500){
                URL imagenURL = getClass().getClassLoader().getResource("moneda500.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i).getValor() == 1000){
                URL imagenURL = getClass().getClassLoader().getResource("moneda1000.jpg");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i).getValor() == 2000){
                URL imagenURL = getClass().getClassLoader().getResource("moneda2000.jpg");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            label.setIcon(icon);
            add(label);
            updateUI();
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
