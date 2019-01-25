package sin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Peridactite
 */
public class Painter extends JPanel{
    int HEIGHT = 500; //actually half height
//    int HEIGHT, HEIGHT;
//    public void point(int HEIGHT, int HEIGHT){
//        this.HEIGHT = HEIGHT;
//        this.HEIGHT = HEIGHT;
//    }
     
    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
        System.out.println("Paint start");
        Graphics2D g2 = (Graphics2D) g;    
//        g2.drawLine(x, y, x, y);
        
        int[] prevPoint = new int[2];
//        int loopStart = 0;
//        int loopEnd = 1000;
        int screenWidth = HEIGHT;//TODO fix this later
//        for(int x = 0; x < 1000; x += 1){ 
//            int y = (int)SineWave.arcSin(x, 400, 1000,0f, screenWidth);
//            System.out.println("(" + x + ", " + y + ")");
//            g2.drawLine(prevPoint[0], prevPoint[1], x, y);
//            prevPoint[0] = x;
//            prevPoint[1] = y;
//        }       
        
        int ampRange = 200;
        int perRange = 200;
        int verticalShift = HEIGHT;
        Random rn = new Random();
        float amplitude = rn.nextInt(ampRange+1)+1;
        float period = rn.nextInt(perRange+1)+1;
        System.out.println("Random Amp: " + amplitude);
        System.out.println("Random Per: " + period);
        for(int x = 0; x < 1000; x++){
            float prevPeriod = 0;
            int y = (int)SineWave.arcSin(x, amplitude, 200, (prevPeriod)+x,verticalShift);//TODO change this to prevPeriod/2
            System.out.println("(" + x + ", " + y + ")");
            g2.drawLine(prevPoint[0], prevPoint[1], x, y);
            prevPoint[0] = x;
            prevPoint[1] = y;
            
            //TODO if it's lower amp it should change to width -1
            if(y == ((HEIGHT) - amplitude) /*|| y == ((HEIGHT -1) + amplitude)*/){    //TODO change this from HEIGHT to vertSHift
                prevPeriod = period;
                System.out.println("Prev Random Amp: " + amplitude);
                System.out.println("Prev Random Per: " + period);            
                amplitude = rn.nextInt(ampRange+1)+100;
                period = rn.nextInt(perRange+1)+100;
                verticalShift = (y+(HEIGHT/2));
                System.out.println("Random Amp: " + amplitude);
                System.out.println("Random Per: " + period);
            }
        }
        
        System.out.println("Paint end");
    }
    
    
    public static void randomSinWaves(int loops, int ampRange, int perRange){
        
    }
    public void drawSquare(){
        
    }
}
