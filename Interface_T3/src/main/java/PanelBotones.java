import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PanelBotones extends JPanel {
    public PanelBotones(MiPanel mp){
        this.setBackground(Color.green);
        JRadioButton jr1 = new JRadioButton("boton1");
        this.add(jr1);

        JRadioButton jr2 = new JRadioButton("boton2");
        this.add(jr2);

        JRadioButton jr3 = new JRadioButton("boton3");
        this.add(jr3);

        ButtonGroup bg = new ButtonGroup( );
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);

    }
}
