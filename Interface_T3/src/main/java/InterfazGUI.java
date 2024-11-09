import java.awt.*;
import javax.swing.*;
/*
+               +
|  InterfazGUI  |   // rectángulo abierto arriba
+-------+-------+
       / \
       \ /
        |
       +-------+--------    ---+
       | Ventana        ....   |     +---------+
       +---+---+---+----    -+-+     | JPanel  |
          / \ / \ / \       / \      +----+----+
          \ / \ / \ /       \ /          / \
            |  |   |   ....  |          /___\
                             |            |
                      +------+------------+----+
                      |         MiPanel        |
                      +-----------------------
                        // Otras Clases serán creadas como componentes de Ventana
*
* */

public class InterfazGUI {
    public static void main(String[] args) {
        Ventana v = new Ventana(); //única sentencia
    }
}
