
package cambio;
import java.util.Scanner;

public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   float dola,Euros,cambio;
   Scanner sc;
   sc=new Scanner(System.in);
   System.out.println("Introdusca Euros");
   Euros =sc.nextFloat();
   System.out.println( "En cuanto esta el cambio");
   cambio=sc.nextFloat();
   dola=Euros*cambio;
    
      System.out.println("El equivalente de " +Euros + " euros son " +dola +" dolare");
    
    
    
    }
    
}
