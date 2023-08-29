
package subprogramas;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
       
      
        nombres();
    }
    
    public static String nombres(){
        String validez,salir;
         Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese edad:");
        int edad = leer.nextInt();
            if (edad<18) {
                validez = "El usuario es menor de edad";
                System.out.println(validez);
        }else {
                validez = "El usuario es mayor de edad";
                System.out.println(validez);
        }
            System.out.println("Desea seguir mostrando personas?");
            salir = leer.next().toUpperCase();
            
        }while (!"NO".equals(salir));
        
        return validez;
    }
}
