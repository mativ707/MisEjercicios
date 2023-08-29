
package cantante.famoso.app;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoAPP {
//    2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
//objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
//cada cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios.
    public static void main(String[] args) {
        CantanteFamoso cf = new CantanteFamoso();
        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        crear(cantantes);
        menu(cantantes);
    }
    
    public static void crear(ArrayList<CantanteFamoso> cantantes){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del cantante " + (i+1)+": ");
            String nombre = leer.next();
            System.out.print("Ingrese el disco con más ventas del cantante " + (i+1)+ ": ");
            String discoConMasVentas = leer.next();
            cantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
        }
        System.out.println("La lista de cantantes con sus discos más vendidos son:");
        for (CantanteFamoso aux : cantantes) {
            System.out.println("NOMBRE: " + aux.getNombre() + " DISCO CON MÁS VENTAS: " 
                    + aux.getDiscoConMasVentas());
        }
    }
    
    public static void menu(ArrayList<CantanteFamoso> cantantes){
        Scanner leer = new Scanner(System.in);
        boolean salir = true;
        
        while(salir){
            System.out.println("\n"+"INGRESE UNA OPCIÓN:");
            System.out.println("1.Agregar cantante.");
            System.out.println("2.Mostrar todos los cantantes.");
            System.out.println("3.Eliminar un cantante.");
            System.out.println("4.Salir.");
            int resp = leer.nextInt();
            switch(resp){
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese el disco con más ventas del cantante: ");
                    String discoConMasVentas = leer.next();
                    cantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
                    System.out.println("Se agregó correctamente!");
                    break;
                case 2:
                    System.out.println("La lista de cantantes con sus discos más vendidos son:");
                    for (CantanteFamoso aux : cantantes) {
                        System.out.println("NOMBRE: " + aux.getNombre() + " DISCO CON MÁS VENTAS: "
                                + aux.getDiscoConMasVentas());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cantante a borrar: ");
                    String eliminar = leer.next().toUpperCase();
                    boolean valid = true;
                    Iterator <CantanteFamoso> it = cantantes.iterator();
                    
                    while (it.hasNext()){
                        if(it.next().getNombre().equalsIgnoreCase(eliminar)){
                            it.remove();
                            valid = false;
                        }
                    }
                    if (valid) {
                        System.out.println("El nombre no se encuentra en la lista");
                        break;
                    } else{
                        System.out.println("Se ha eliminado correctamente!");
                        break;
                    }
                case 4:
                    salir = false;
                    break;
            }
        }
    }
}
