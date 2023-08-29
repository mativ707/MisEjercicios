package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarRaza(ArrayList<String> razas) {
        String respuesta;
        do {
            System.out.println("Desea agregar raza de perro? S/N");
            respuesta = leer.next();
            //AQUI SE VALIDA SI LA RESPUESTA ES SI
            if (respuesta.toLowerCase().equals("s")) {
                System.out.println("Ingrese la raza: ");
                razas.add(leer.next());
            }
        } while (respuesta.toLowerCase().equals("s"));
    }

    public void mostrarRaza(ArrayList<String> razas) {
        Collections.sort(razas);
        System.out.println("Las razas disponibles son: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
    }

    public void buscarPerro(ArrayList<String> razas) {
        Iterator<String> it = razas.iterator();

        System.out.println("Ingrese la raza de perro a buscar: ");
        String raza = leer.next();
        boolean valid=true;
        
        while (it.hasNext()) {
            if (it.next().equals(raza)){
                it.remove();
                valid=false;
            }
        }
        
        if(valid){
            System.out.println("No se removió " + raza + " ya que no fue encontrada");
        }else{
            System.out.println("La raza " + raza + " se removió correctamente");
        }
        mostrarRaza(razas);
    }

}

