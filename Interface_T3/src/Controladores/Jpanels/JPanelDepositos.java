package Controladores.Jpanels;

import Complementos.Deposito;
import Complementos.Moneda;
import Complementos.Seleccionador;
import Controladores.ImagenProductos.*;

import javax.swing.*;
import java.awt.*;

public class JPanelDepositos extends JPanel {
    private DepositoEstandar<ImagenCoca> panelCoca;
    private DepositoEstandar<ImagenFanta> panelFanta;
    private DepositoEstandar<ImagenSprite> panelSprite;
    private DepositoEstandar<ImagenSuper8> panelSuper8;
    private DepositoEstandar<ImagenSnickers> panelSnickers;
    private JPanelMonedas panelMonedas;
    private DepositoEstandar<ImagenProductoNulo> panelPNulo;
    private final JPanel[] paneles = {panelCoca, panelFanta, panelSprite, panelSnickers, panelSuper8,};
    public JPanelDepositos(int size) {
        this.setBackground(Color.gray);
        setLayout(new GridLayout(7,1));
        setOpaque(false);
        this.panelCoca = new DepositoEstandar<>(ImagenCoca::new, size);
        this.panelFanta = new DepositoEstandar<>(ImagenFanta::new, size);
        this.panelSprite = new DepositoEstandar<>(ImagenSprite::new, size);
        this.panelSuper8 = new DepositoEstandar<>(ImagenSuper8::new, size);
        this.panelSnickers = new DepositoEstandar<>(ImagenSnickers::new, size);
        this.panelPNulo = new DepositoEstandar<>(ImagenProductoNulo::new, size);
        this.panelMonedas = new JPanelMonedas();
    }
    public void actualizarMonedas(Moneda m) {panelMonedas.AñadirMonedaGrafica(m);}
    public void rellenarImagenes(){
        panelCoca.rellenarTodo();
        panelFanta.rellenarTodo();
        panelSprite.rellenarTodo();
        panelSuper8.rellenarTodo();
        panelSnickers.rellenarTodo();
        panelPNulo.rellenarTodo();
    }
    public void removeProducto(Seleccionador seleccion) {
        int i = seleccion.ordinal();
        switch(i){
            case 0:
                panelCoca.removeProducto();
                break;
            case 1:
                panelFanta.removeProducto();
                break;
            case 2:
                panelSprite.removeProducto();
                break;
            case 3:
                panelSnickers.removeProducto();
                break;
            case 4:
                panelSuper8.removeProducto();
                break;
            case 5:
                break;
        }
    }

}
