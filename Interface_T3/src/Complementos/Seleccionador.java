package Complementos;

/** Enumerador de productos con sus respectivos precios y métodos para crearlos */
public enum Seleccionador {
    COCACOLA(1200) {
        @Override
        public Producto crearProducto(int serie) {
            return new Cocacola(serie);
        }
    },
    FANTA(1200) {
        /**
         * @param serie Número de serie del producto.
         * @return
         */
        @Override
        public Producto crearProducto(int serie) {
            return null;
        }
    },
    SPRITE(1200) {
        /**
         * Método que crea un producto.
         * @param serie Número de serie del producto.
         * @return Retorna un producto
         */
        @Override
        public Producto crearProducto(int serie) {
            return null;
        }
    },
    SNICKERS(1500) {
        /**
         * Método que crea un producto.
         *
         * @param serie Número de serie del producto.
         * @return Retorna un producto
         */
        @Override
        public Producto crearProducto(int serie) {
            return null;
        }
    },
    SUPER8(300) {
        /**
         * Método que crea un producto.
         *
         * @param serie Número de serie del producto.
         * @return Retorna un producto
         */
        @Override
        public Producto crearProducto(int serie) {
            return null;
        }
    };

    private final int precio;
    //private final String nombreProducto;

    /**
     * Constructor de la clase Seleccionador
     * @param precio Precio del producto
     *
     */
    Seleccionador(int precio) {
        this.precio = precio;
        //this.nombreProducto = nombreProducto;
    }

    /**
     * Método que regresa el precio de un producto.
     * @return Retorna el precio de un producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Método que crea un producto.
     * @param serie Número de serie del producto.
     * @return Retorna un producto
     */
    public abstract Producto crearProducto(int serie);
}
