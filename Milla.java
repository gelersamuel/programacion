
package milla;
import java.util.Scanner;

public class Milla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    float milla,metro;
    Scanner sc;
    
    sc= new Scanner(System.in );
    System.out.println("Introduzca la milla marina");
    milla=sc.nextFloat();
    
    metro=milla*1852;
          System.out.println(milla + " Milla marinas son " +metro + " metro");
    
    
    
    
    
    
    
    
    
    }
    

    
}
