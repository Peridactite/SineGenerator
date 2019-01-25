package sin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Peridactite
 */
public class Main {
    public static void main(String[] args){
        window();        
        SineWave.arcSin(10,10000,0,0);    
    }
    public static void window(){
        JFrame window = new JFrame();
        window.setSize(1000,1000);
        window.setTitle("A Window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Painter p = new Painter();
        window.add(p);
        window.setVisible(true);               
        //paint
    }    
}
