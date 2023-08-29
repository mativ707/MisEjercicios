
package subprogramas;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        cambio();
    }
    
    public static void cambio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros:");
        int euros = leer.nextInt();
        
        System.out.println("1. CONVERTIR A YENES");
        System.out.println("2. CONVERTIR A PESOS");
        System.out.println("1. CONVERTIR A LIBRAS");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                double yenes;
                yenes = (euros*129852/1);
                System.out.println(euros +" euros, es igual a " + yenes +" yenes." );
                break;
            case 2:
                double pesos;
                pesos = (euros*1.28611/1);
                System.out.println(euros +" euros, es igual a " + pesos + " pesos.");
                break;
            case 3:
                double libras;
                libras = (euros*0.86/1);
                System.out.println(euros +" euros, es igual a " + libras + " libras.");
                break;
        }
    }
}
