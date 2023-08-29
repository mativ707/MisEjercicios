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
public class Ejemplo_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner leer = new Scanner(System.in);
        int j = 0;
        int num;
        int contador = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num==0){
                System.out.println("Se capturó el 0!");
                break;
            }
            if (num > 0){
                j++;
                contador = contador+num;
                
            }else{
                continue;
            }
        } while (j <= 19);
        
        System.out.println("La suma de los " + j + " números ingresados es igual a " + contador);
    }
}
