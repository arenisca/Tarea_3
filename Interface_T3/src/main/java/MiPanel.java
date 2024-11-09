import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MiPanel extends JPanel {
    private Triangulo t;
    public MiPanel() {
        this.setBackground(Color.RED);
        t=new Triangulo(80,60);
        this.addMouseListener(new EscuchaRaton());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);   // se llama al paint de la super clase
        // se agrega para pintar rectángulo rojo
        g.setColor(Color.darkGray); //se unta el pincel g en color rojo
        g.fillRect(0, 200, 600, 250);    //se le dice al pincel pinte rectángulo

        g.setColor(Color.yellow);
        g.fillOval(300,150,30,30);
        if(t!=null)t.paintComponent(g);
    }
    private class EscuchaRaton implements MouseListener {
        public void mouseClicked(MouseEvent me) {;}
        public void mousePressed(MouseEvent me) {
            System.out.println("press");
        }
        public void mouseReleased(MouseEvent me) {;}
        public void mouseEntered(MouseEvent me) {
            System.out.println("entra");
        }
        public void mouseExited(MouseEvent me) {;}
    }
}

