package sin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

/**
 *
 * @author Peridactite
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Main Run");
        window();
        System.out.println("Main End");         
    }
    
    
    
    public static void window(){  
        System.out.println("window start"); 
        JFrame window = new JFrame();
        window.setSize(1000,1000);
        window.setTitle("A Window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Painter p = new Painter();
        window.add(p);
        window.setVisible(true);   
        System.out.println("window End"); 
    }    
}
