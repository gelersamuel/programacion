
package bol6;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Bol6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner sc;
        Circulo cir, cir2;
        sc=new Scanner(System.in);
        cir=new Circulo();
        System.out.println("Introduzca el radio del circulo 2:");
        cir2=new Circulo(sc.nextDouble());
        System.out.println("Area del circulo 1: " + cir.calcularArea() + "\n Longitud: " + cir.calcularLongitud());
        System.out.println("Area del circulo 2: " + cir2.calcularArea() + "\n Longitud: " + cir2.calcularLongitud());
    
        
        
        
        
        
        
        
        
        
        
    }
    
}
