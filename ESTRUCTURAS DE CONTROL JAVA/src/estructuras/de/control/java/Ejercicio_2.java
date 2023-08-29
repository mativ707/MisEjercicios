/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.de.control.java;

import java.util.Scanner;

/**
 *
 * @author Userç
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase:");
       
       String frase;
       frase = leer.nextLine();
      
       
       if(frase.equals("eureka")) {
           System.out.println("Correcto");
           
        } else {
           System.out.println("Incorrecto");
       }
           
       
       
       
       
       
        
        
        
        
    }
    
}
