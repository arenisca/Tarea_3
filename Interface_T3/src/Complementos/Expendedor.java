package Complementos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * @author Gabriela Escalona
 * @author Valentina Serón
 * @version version 2, 03 de octubre 2024
 * @version version 3, 07 de octubre 2024
 */

public class Expendedor {
    /** Clase: Expendedor de productos!
     * @code depositos serán los productos a almacenar
     * @code monedaPago la moneda con que se pagará
     * @code monedaVuelto la moneda a retornar al usuario
     * @code producto será el producto que va a retornar al usuario */

    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Moneda> coin;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private ArrayList<Deposito<Producto>> depositos;
    private Deposito<Moneda> monedaPago;
    private Deposito<Moneda> monedaVuelto;
    private int c = 100;
    private int size;
    private Producto producto;

    public Expendedor(int numProductos){
        fanta = new Deposito<>();
        coca = new Deposito<>();
        sprite = new Deposito<>();
        coin = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        depositos = new ArrayList<>();
        monedaPago = new Deposito<>();
        monedaVuelto = new Deposito<>();

        depositos.add(coca);
        depositos.add(sprite);
        depositos.add(fanta);
        depositos.add(snickers);
        depositos.add(super8);

        for(Seleccionador p : Seleccionador.values()){
            for(int i = 0; i < size; i++){
                Producto producto = p.crearProducto(i+c);
                depositos.get(p.ordinal()).addProducto(producto);
            }
            c=c+ 100;
        }
    }

    /** Método que rellena los depósitos de productos. */
    public void rellenarDepositos() {
        if (coca.size() < size) {
            for (int i = coca.size(); i < size; i++) {
                Producto producto = Seleccionador.COCACOLA.crearProducto(i+c);
                coca.addProducto(producto);
                c++;
            }
        }
        if (sprite.size() < size) {
            for (int i = sprite.size(); i < size; i++) {
                Producto producto = Seleccionador.SPRITE.crearProducto(i+c);
                sprite.addProducto(producto);
                c++;
            }
        }
        if (fanta.size() < size) {
            for (int i = fanta.size(); i < size; i++) {
                Producto producto = Seleccionador.FANTA.crearProducto(i+c);
                fanta.addProducto(producto);
                c++;
            }
        }
        if (snickers.size() < size) {
            for (int i = snickers.size(); i < size; i++) {
                Producto producto = Seleccionador.SNICKERS.crearProducto(i+c);
                snickers.addProducto(producto);
                c++;
            }
        }
        if (super8.size() < size) {
            for (int i = super8.size(); i < size; i++) {
                Producto producto = Seleccionador.SUPER8.crearProducto(i+c);
                super8.addProducto(producto);
                c++;
            }
        }
        
    }




    public void comprarProducto(Moneda m, Seleccionador cual) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        /**
         * Este método entrega un producto del Expendedor,
         * en el caso de tener una compra exitosa (si no, hay excepciones).
         * @param m corresponde a la moneda ingresada.
         * @param cual es el producto que se seleccionó.
         */
        int i = 0;
        if (cual == null) {
            // Manejar el caso donde 'cual' es null, tal vez mostrar un mensaje de error
            System.out.println("Error: el producto no ha sido seleccionado.");
        } else {
            // El código original donde 'cual' no es null
            i = cual.ordinal();
        }

        if(m == null){
            throw new PagoIncorrectoException("El pago es incorrecto.");
        }
        else if(m.getValor() < cual.getPrecio()){
            monedaVuelto.addProducto(m);
            throw new PagoInsuficienteException("El pago es insuficiente.");
        }
        else if( depositos.get(cual.ordinal()).isEmpty() ) {
            monedaVuelto.addProducto(m);
            throw new NoHayProductoException("No hay producto." + cual.toString().toLowerCase());
        }
        else {
            int vuelto = (m.getValor() - cual.getPrecio()) / 100;
            for (int j = 0; j < vuelto; j++) {
                monedaVuelto.addProducto(new Moneda100(j+1));
            }
            producto = depositos.get(i).getProducto();
            monedaPago.addProducto(m);
        }
    }
    /** @return retorna una moneda del deposito de monedas. */
    public Moneda getVuelto(){
        Moneda m = coin.getProducto();
        return m;
    }
    /** @return retorna el producto que se compró. */
    public Producto getProducto() {
        return producto;
    }
}