
package estructuras.de.control.java;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String primerLetra = frase.substring(0,1).toUpperCase(); // SE PUEDEN AGREGAR FUNCIONES SEGUIDAS EN EL MISMO RENGLON
        
        if(primerLetra.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
