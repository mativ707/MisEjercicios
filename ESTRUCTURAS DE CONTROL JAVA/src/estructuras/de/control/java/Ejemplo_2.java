
package estructuras.de.control.java;

import java.util.Scanner;

public class Ejemplo_2 {

    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in); 
        int opcion;
       opcion = leer.nextInt();
       
       switch(opcion){
           case 1:
               System.out.println("Esta línea se ejecuta si opcion = 1");
               break;
           case 2:
               System.out.println("Esta línea se ejecuta si opcion es = 2");
               break;
           case 3:
               System.out.println("Esta línea se ejecuta si opcion es = 3");
               break;
           default:
               System.out.println("El valor ingresado en la variable opcion es diferenta a todos los casos analizados por el switch");
               
       }
       
    }
    
}
