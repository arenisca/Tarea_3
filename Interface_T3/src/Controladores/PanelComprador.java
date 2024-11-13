package Controladores;

import Complementos.Moneda;
import Controladores.Jpanels.JPanelBilletera;
import Controladores.Jpanels.JPanelCarrito;
import Controladores.Jpanels.JPanelSelect;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class PanelComprador extends JPanel {
    private JPanelSelect panel;
    private JPanelBilletera chauchero;
    private JPanelCarrito bolsillo;
    private PanelVueltoCompra vuelto;

    public PanelComprador() {
        panel = new JPanelSelect();
        panel.setPreferredSize(new Dimension(600,200));
        panel.setBorder(new LineBorder(Color.black,3));
        JPanel panelAjustado = new JPanel(new FlowLayout());

        chauchero = new JPanelBilletera();
        chauchero.setPreferredSize(new Dimension(500,300));
        JPanel Ajustechauchero = new JPanel(new FlowLayout());
        Ajustechauchero.add(chauchero);
        // Lo siguiente va a permitir mostrar el fondo de la ventana
        Ajustechauchero.setOpaque(false);

        bolsillo = new JPanelCarrito();
        bolsillo.setPreferredSize(new Dimension(100,20));
        vuelto = new PanelVueltoCompra();
        vuelto.setPreferredSize(new Dimension(100,20));

        add(bolsillo); add(vuelto); add(Ajustechauchero); add(panelAjustado);
    }
    public JPanelSelect getPanel() {return panel;}
    public JPanelBilletera getChauchas() {return chauchero;}
    public JPanelCarrito getBolsillo() {return bolsillo;}
    public void ActualizarBolsilloVuelto(ArrayList<Moneda> monedasComprador) {
        vuelto.RecibirVuelto(monedasComprador);
        updateUI();
    }
    protected void paintComponent(Graphics g) {super.paintComponent(g);}


}
