package Controladores.BotonesMonedas;
import Complementos.*;
import Controladores.Jpanels.*;
import Controladores.PanelComprador;
import Controladores.PanelExpendedor;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Clase que representa un botón de compra
 */
public class BotonCompra extends JPanel {
    private Expendedor expendedor;
    private JPanelSelect comPanel;
    private JPanelBilletera monedero;
    private Seleccionador s;
    private Moneda moneda;
    private Comprador comprador;
    private DepositoCompra depositoCompra;
    private JButton BotonCompra= new JButton("Compra");

    public BotonCompra(PanelExpendedor panelExpendedor, PanelComprador panelComprador) {
        /**
         * Este panel de botones será la clase que contenta los JButton de cada producto
         *
         * Al presionar un botón de producto, se realizará la compra siempre y
         * cuando se haya seleccionado una moneda y un producto que irán al deposito
         * o carrito respectivamente.
         * {@code Comprador} y {@code depositoCompra} reciben los parámetros:
         * y despues son enviados al deposito de la compra.
         * @param panelExpendedor corresponde al expendedor de productos
         * @param panelComprador es el panel del comprador
         * En caso de una compra exitosa, se borra el producto del panel y carrito
         * para luego agregar al bolsillo :)
         * Y la moneda que se ingresa quedará en en deposito de monedas visible en
         * el expendedor
         */
        this.expendedor = panelExpendedor.getExpendedor();
        this.comPanel = panelComprador.getPanel();
        this.monedero = panelComprador.getChauchas();
        this.depositoCompra = panelExpendedor.getDepositoCompra();
        add(BotonCompra);

        /**
         * @param s es el producto seleccionado
         * @param comPanel son los componentes del panel, que en este caso
         *                 corresponden a los botones de los productos.
         * @param depositoCompra corresponde al panel donde se verán los productos comprados
         * @param
         * */

        BotonCompra.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    s = comPanel.getTipoProducto();
                    moneda = monedero.getMoneda();
                    comprador = new Comprador(moneda, s, expendedor);
                    depositoCompra.setProducto(expendedor.getProducto());
                    panelExpendedor.getPanelDepositos().removeProducto(s);
                    panelComprador.getBolsillo().addProducto(expendedor.getProducto());
                    panelExpendedor.getPanelDepositos().actualizarMonedas(moneda);
                    panelComprador.ActualizarBolsilloVuelto(comprador.getMonedasVuelto());
                } catch (PagoIncorrectoException ex) {
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una moneda.");
                } catch(NoHayProductoException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "No hay stock o el producto no existe. \nVuelto: " + moneda.getValor());
                    ArrayList<Moneda> monedas = new ArrayList<>();
                    monedas.add(moneda);
                    panelComprador.ActualizarBolsilloVuelto(monedas);
                } catch(PagoInsuficienteException ex) {
                    Moneda moneda = expendedor.getVuelto();
                    JOptionPane.showMessageDialog(null, "El pago es insuficiente. \nVuelto: " + moneda.getValor());
                    ArrayList<Moneda> monedas = new ArrayList<>();
                    monedas.add(moneda);
                    panelComprador.ActualizarBolsilloVuelto(monedas);
                }

            }

            @Override
            public void mousePressed(MouseEvent e) { //presionado

            }

            @Override
            public void mouseReleased(MouseEvent e) { //soltado

            }

            @Override
            public void mouseEntered(MouseEvent e) { //entra (por encima)

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
