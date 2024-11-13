package Controladores.Jpanels;

import Complementos.Seleccionador;
import Controladores.BotonesProductos.*;
import javax.swing.*;
import java.awt.*;

public class JPanelSelect extends JPanel {
    /**
     * Esta clase corresponde a los botones, panel de botones, de los productos
     * visualizados en columnas de 2 x 3 filas
     * {@code setTipoProducto es el método que establecerá qué producto es el que se
     * seleccionó para luego retornar el tipo de producto en el método {@code geTipoProducto}}
     * */
    private Seleccionador tipo;
    private BotonSnickers b1;
    private BotonSuper8 b2;
    private BotonCoca b3;
    private BotonFanta b4;
    private BotonSprite b5;
    private BotonProductoNulo b6;

    public JPanelSelect(){
        b1= new BotonSnickers(this);
        b2 =new BotonSuper8(this);
        b3=new BotonCoca(this);
        b4=new BotonFanta(this);
        b5=new BotonSprite(this);
        b6=null;
        setLayout(new GridLayout(3,2));
        ButtonGroup productos = new ButtonGroup();
        productos.add(b1); productos.add(b2); productos.add(b3);
        productos.add(b4); productos.add(b5); productos.add(b6);
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6);


    }
    public void setTipoProducto(Seleccionador s){
        this.tipo=s;
    }

    public Seleccionador getTipoProducto() {
        return this.tipo;
    }
}
