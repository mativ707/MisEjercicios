
package arrayapp;

import Servicios.ArregloService;
import java.util.Scanner;

public class ArrayAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArregloService as = new ArregloService();
        
        double A[] = new double [50];
        double B[] = new double [20];
        
        // INICIALIZAR A
        as.inicializarA(A);
        System.out.println("\n");
        // MOSTRAR ARREGLO "A"
        System.out.println("El arreglo A es: ");
        as.mostrar(A);
        System.out.println("\n");
        // ORDENAR ARREGLO A
        as.ordenar(A);
        System.out.println("\n");
        // INICIALIZAR B
        as.inicializarB(B,A);
        System.out.println("\n");
        // MOSTRAR B
        System.out.println("El arreglo B es: ");
        as.mostrar(B);
    }
    
}
