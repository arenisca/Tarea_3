package Controladores.Jpanels;

import javax.swing.*;
import java.awt.*;
import java.util.function.Supplier;

public class DepositoEstandar<T extends JComponent> extends JPanel {
    private Supplier<T> tipo;
    private int size;
    public DepositoEstandar(Supplier<T> tipo, int size) {
        this.size=size;
        this.tipo=tipo;
        this.setBackground(Color.blue);
        for (int i=0; i<5;i=i+1) {
            T imagen=tipo.get();
            add(imagen);
        }
        setLayout(new FlowLayout(FlowLayout.CENTER, -50,0));
        setOpaque(false);
    }
    public void removeProducto(){
        if(this.getComponentCount() >0){
            this.remove(0);
            this.updateUI();
        }
    }
    public void rellenarTodo() {
        this.removeAll();
        for (int i=0;i<size;i=i+1){
            T image = tipo.get();
            add(image);
        }
    }
}
