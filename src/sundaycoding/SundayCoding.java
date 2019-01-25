package sundaycoding;
import java.lang.*; 
public class SundayCoding {
    public static void main(String[] args) {
        //print "o" 100 times
        // 1 to 100
        // (    ;   ;   )
        // ONE: starting point
        // TWO: range in the form of inequality
            // 1 < 5 TRUE
            // 2 < 5 TRUE
            // 3 < 5 TRUE
            // 4 < 5 TRUE
            // 5 < 5 FALSE 
        // THREE: count by one, or two, or whatever you want
        
        
        
        
        
        
        
        
        
        
//        
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        System.out.println("a printed word goes here.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        arcSin(50);
//        System.out.println(10.0 * Math.sin(5.0/10.0));
    }
    
    public static void arcSin(int amplitude){
        double piMultiplier = amplitude;

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
    
    
}
