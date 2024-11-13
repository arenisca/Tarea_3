//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import javax.swing.JPanel;
//
//public class MiPanelMouse extends JPanel implements MouseListener {
//    private Triangulo e;
//    public MiPanelMouse(){
//        super();
//        this.setBackground(Color.cyan);
//        e = new Triangulo(100,100);
//        this.addMouseListener(this); // inscribe el manejador de evento para que lo llamen (en este caso él mimo)
//    }
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        if(e!=null)e.paintComponent(g);
//    }
//    public void mouseClicked(MouseEvent me) {;} // es llamado cuando el press y el release ocurren en el mismo pixel
//    public void mousePressed(MouseEvent me) {
//        System.out.println("press"); //se imprimirá press cada vez que se oprima un botón del mouse dentro del área
//    }
//    public void mouseReleased(MouseEvent me) {;} // el llamado al soltar el botón
//    public void mouseEntered(MouseEvent me) {;}  // cursor entra al área
//    public void mouseExited(MouseEvent me) {;}   // cursor sale del área
//}

