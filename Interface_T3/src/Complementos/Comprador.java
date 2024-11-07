package Complementos;

import java.util.ArrayList;
/**
 * @version version 2, 03 de octubre 2024
 * @version version 3, 6 de noviembre 2024
 */
class Comprador {
    /**
     * Comprador representará: un comprador que tiene una moneda para pagar, una elección
     *                         de producto y un expendedor donde realizará su compra
     * @param m Es la moneda ingresada
     * @param cualProducto Selección del producto deseado, 1 para cocacola, 2 para sprite,
     *                     3 para fanta, 4 para snickers y 5 para super8
     * @param exp Es el expendedor donde se realizará compra.
     * @param b1 Es la instancia del producto (dulce o bebida) que se escogerá
     * @throws NoHayProductoException En caso que no haya stock o que el producto no exista.
     * @throws PagoInsuficienteException En caso que la moneda sea insuficiente para pagar el producto.
     * @throws PagoIncorrectoException En caso que la moneda no se haya instanciado correctamente.
     */

    private String sonido;
    private int vuelto = 0;
    private ArrayList<Moneda> monedas = new ArrayList<>();
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto b1 = exp.comprarProducto(m, cualProducto);

        /** Este ciclo se utilizará para que el comprador pueda retirar su vuelto */
        while (true) {
            Moneda a = exp.getVuelto();
            if (a == null) {
                break;
            } else {
                vuelto += a.getValor();
                monedas.add(a);
            }
        }

        if (b1 != null) {
            sonido = b1.consumir();
        } else{
            sonido = null;
        }
    }
    /** @return Retorna el vuelto correspondiente a la compra efectuada */
    public int cuantoVuelto(){
        return vuelto;
    }
    /** @return Hace saber cuál producto ha comprado el comprador */
    public String queConsumiste(){
        return sonido;
    }
    /** @return Se da el vuelto al comprador */
    public ArrayList<Moneda> getMonedasVuelto() {
        return monedas;
    }
}