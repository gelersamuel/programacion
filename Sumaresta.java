
package sumaresta;
import java.util.Scanner;
public class Sumaresta {
   
    public static void main(String[] args) {
        // TODO code application logic here
  
    float x,y,suma,Resta,mul,div;
    
    Scanner sc;
     sc=new Scanner(System.in);
        System.out.println("Introduzca 2 valores:");
        x=sc.nextFloat();
        y=sc.nextFloat();
        suma=x+y;
        Resta=x-y;
        mul=x*y;
        div=x/y;
        System.out.println("Suma: " +suma);
        System.out.println("Resta: " +Resta);
        System.out.println("Multiplicacion: " +mul);
        if(y!=0){
            System.out.println("Cociente: " +div);
        
            System.out.println("no puedo dividir entre 0");
        }
    
    
    
    }
    
}
