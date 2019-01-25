package sin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Peridactite
 */
public class SineWave { 
    /**
     * 
     * @param x
     * @param amplitude
     * @param period
     * @param phaseShift
     * @param verticalShift
     * @return 
     */
    public static float arcSin(float x, float amplitude, float period, float phaseShift, float verticalShift){
        return (amplitude * (float)Math.sin(((2f * (float)Math.PI)/period) * (x + phaseShift)) + verticalShift);
    }
    
    public static void wave(int amplitude){
        for(int i = 0; i <= 100; i = i + 1){
//            System.out.println("i: " + i);
            int numSpace = 0;
            if((i%amplitude) < (amplitude/2)){
                numSpace = 0 + (i%(amplitude/2));
            }
            else{
                numSpace = amplitude - (i%amplitude);
            }
            // print whitespace with loop ranging from 0 to 99
            for(int second_interator = 0; second_interator <= numSpace; second_interator = second_interator + 1){
                System.out.print(" ");
            }
            System.out.println("o");
        }
    }
          
    public static void arcSin(int amplitude){

        for(double i = 0; i <= 1000; i = i + 1){
//            System.out.println("i: " + i);
            //   amplitude * sin(x/amplitude)
            int numberSpaces = (int)Math.floor(amplitude * Math.sin(i/amplitude));
            numberSpaces = numberSpaces + amplitude;
            for(int j = 0; j <= numberSpaces; j = j + 1){
                System.out.print(" ");
            }
            System.out.println("o");
        }
    }
    //TODO Bug: Fix odd numbered amplitude
    
    public static void main(String[] args){
        //testing
//        SineWave.arcSin(10,10000,0,0);    
    }
}
