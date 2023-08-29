
package estructuras.de.control.java;

import java.util.Scanner;


public class Ejercicio_5 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un límite positivo:");
        int limite = leer.nextInt();
        int acumulador = 0;
        
        do {
            System.out.println("Ingrese un número:");
            int num = leer.nextInt();
            acumulador = acumulador + num;
        }while(acumulador < limite);
        
    }
    
}
