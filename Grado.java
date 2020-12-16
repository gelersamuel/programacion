/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grado;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Grado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      float gradosC, gradosK, gradosF;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Introduzca temperatura en grados en casa:");
        gradosC=sc.nextFloat();
        gradosK=gradosC + 273;
        gradosF=gradosC*9/5 + 32;
        System.out.println(gradosC + " grados en casa equivalen a:\n" + gradosK +" grados geler\n" + gradosF + " grados Fahrenheit");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    

