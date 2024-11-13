//import java.awt.*;
//import javax.swing.JPanel;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//
//public class MiPanel extends JPanel implements MouseListener {
//    private Triangulo t;
//    public MiPanel() {
//        this.setBackground(Color.RED);
//        t=new Triangulo(80,60);
//        this.addMouseListener(new EscuchaRaton());
//    }
//
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);   // se llama al paint de la super clase
//        // se agrega para pintar rectángulo rojo
//        g.setColor(Color.darkGray); //se unta el pincel g en color rojo
//        g.fillRect(0, 200, 600, 250);    //se le dice al pincel pinte rectángulo
//
//        g.setColor(Color.yellow);
//        g.fillOval(300,150,30,30);
//        if(t!=null)t.paintComponent(g);
//    }
//
//    /**
//     * Invoked when the mouse button has been clicked (pressed
//     * and released) on a component.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void mouseClicked(MouseEvent e) {
//
//    }
//
//    /**
//     * Invoked when a mouse button has been pressed on a component.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void mousePressed(MouseEvent e) {
//
//    }
//
//    /**
//     * Invoked when a mouse button has been released on a component.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void mouseReleased(MouseEvent e) {
//
//    }
//
//    /**
//     * Invoked when the mouse enters a component.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void mouseEntered(MouseEvent e) {
//
//    }
//
//    /**
//     * Invoked when the mouse exits a component.
//     *
//     * @param e the event to be processed
//     */
//    @Override
//    public void mouseExited(MouseEvent e) {
//
//    }
//
//    private class EscuchaRaton {
//        public void mouseClicked(MouseEvent me) {;}
//        public void mousePressed(MouseEvent me) {
//            System.out.println("press");
//        }
//        public void mouseReleased(MouseEvent me) {;}
//        public void mouseEntered(MouseEvent me) {
//            System.out.println("entra");
//        }
//        public void mouseExited(MouseEvent me) {;}
//    }
//}
//
