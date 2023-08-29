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
public class Ejemplo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese una nota que se encuentre entre 0 y 10");
       int respuesta = leer.nextInt(); //AQUI SE INICIALIZA LA VARIABLE como entero Y SE LE DA UN VALOR POR TECLADO
       
       while (respuesta >= 10 || respuesta <= 0) {
           
           System.out.println("Ingrese una nota que se encuentre dentro de los parámetros especificados");
           respuesta = leer.nextInt();
    }
       
    }
    
}
