package Complementos;
import java.util.ArrayList;

/**
 * Clase {@code Deposito} representa un depósito que almacena productos
 * de cualquier tipo. Utiliza un {@code ArrayList} para gestionar los productos.
 * El método {@code getProducto} entrega el primer producto o si el depósito está vacío.
 * {@code size} indica el número de productos en el depósito.
 */
public class Deposito<T> {
    /**
     * @param item el producto a agregar
     * @param T el tipo de producto almacenado en el depósito
     */
    private ArrayList<T> productos;
    public Deposito() {
        productos = new ArrayList<>();
    }
    public void addProducto(T item) {
        productos.add(item);
    }

    /** @return Número de objetos almacenados. */
    public int size() {
        return productos.size();
    }
    /** @return el primer producto del depósito o {@code null} si está vacío */
    public T getProducto() {
        if (productos.isEmpty()) {
            return null;
        }
        return productos.remove(0);
    }
    public boolean isEmpty(){
        return productos.isEmpty();
    }

}

