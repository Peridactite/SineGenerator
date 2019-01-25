package sin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Peridactite
 */
public class Painter extends JPanel{
    
    
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;    
        g2.drawLine(10, 10, 20, 20);
    }
}
