/*
 * BlackMadia#1443
 */

package Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MainEJ2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String razaPerro;
        boolean continuar = true;
        
        while(continuar) {
            System.out.print("Ingrese la raza del perro: ");
            razaPerro = sc.nextLine();
            razasPerros.add(razaPerro);
            
            System.out.print("¿Desea ingresar otra raza de perro? (s/n): ");
            String respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        System.out.println("\nRazas de perros guardadas:");
        Collections.sort(razasPerros); // Se ordena la lista de razas de perros
        for(String raza : razasPerros) {
            System.out.println(raza);
        }
        
        System.out.print("\nIngrese una raza de perro para eliminar: ");
        String razaEliminar = sc.nextLine();
        Iterator<String> iter = razasPerros.iterator(); // Se crea un iterador para recorrer la lista
        boolean encontrado = false;
        while(iter.hasNext()) {
            String raza = iter.next();
            if(raza.equalsIgnoreCase(razaEliminar)) {
                iter.remove();
                encontrado = true;
                break;
            }
        }
        
        System.out.println("\nRazas de perros guardadas:");
        Collections.sort(razasPerros); // Se vuelve a ordenar la lista de razas de perros
        if(encontrado) {
            System.out.println("Se eliminó la raza de perro: " + razaEliminar);
        } else {
            System.out.println("No se encontró la raza de perro: " + razaEliminar);
        }
        for(String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}
