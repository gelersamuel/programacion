
package bol5;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Bol5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc;
        Coche vw;
        int valor;
        sc=new Scanner(System.in);
        vw=new Coche();
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
        System.out.println("Introduzca valor para acelerar:");
        valor=sc.nextInt();
        vw.acelerar(valor);
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
        System.out.println("Introduzca valor para frenar:");
        valor=sc.nextInt();
        vw.frenar(valor);
        System.out.println("Velocidad actual: " + vw.getVelocidad() + " Km/h");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
