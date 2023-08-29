/*
 * BlackMadia#1443
 */

package Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
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
        for(String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}