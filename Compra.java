
package compra;

import java.util.Scanner;
public class Compra {

   
     
    public static void main(String[] args) {
        
 float precio_b,precio_p,porc_desc,diff;

     Scanner sc;
     sc=new Scanner(System.in);
            System.out.println("Introduzca el precio base:");
        precio_b=sc.nextFloat();
        System.out.println("Introduzca el precio pagado:");
        precio_p=sc.nextFloat();
        diff=precio_b-precio_p;
        porc_desc=diff*100/precio_b;
        System.out.println("El descuento fue de: " + porc_desc + " porciento");
    }
    
    
    
    }
    

