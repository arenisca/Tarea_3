import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
public class Ejemplo {
    @Test
    /*
    * @param suma   Solo es un ejemplo de suma simple
    * */
    public void testSuma() {
        Unejemplo MiEjemplo = new Unejemplo();
        assertEquals(5, MiEjemplo.suma(2, 3)); // Ejemplo de prueba
    }
}

class Unejemplo{
    public int suma(int a, int b) {
        return a + b;
    }
}

