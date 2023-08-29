
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    Pelicula p1 = new Pelicula();
    Scanner leer = new Scanner(System.in);
    ArrayList <Pelicula> peliculas = new ArrayList();
    
    public void creadorPeliculas(ArrayList <Pelicula> peliculas){
        String titulo;
        String director;
        Integer duracion;
        boolean salir = true;
        
        while(salir){
            System.out.println("Ingrese el nombre de la película: ");
            titulo = leer.next();
            System.out.println("Ingrese el director de la película: ");
            director = leer.next();
            System.out.println("Ingrese la duración en horas de la película: ");
            duracion = leer.nextInt();
            // SE LE DA ORIGEN A LA NUEVA PELÍCULA
            p1 = new Pelicula(titulo, director, duracion);
            // SE AGREGA LA PELÍCULA P1 A LA LISTA DE PELÍCULAS
            peliculas.add(p1);
            System.out.println("Desea crear otra película? S/N");
            String resp;
            resp = leer.next();
            
            if(resp.equals("n")){
                salir = false;
                System.out.println(salir);
            }   
        }
    }
    
    public void mostrarPeliculas(ArrayList <Pelicula> peliculas){
        System.out.println("Las películas de la lista son: " + "\n");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
        System.out.println("Las películas de la lista de mayor duración a 1 hr son: " + "\n");
        for (Pelicula aux : peliculas) {
            if(aux.getDuración() > 1){
               System.out.println(aux); 
            } 
        }
        System.out.println("\n");
    }
    
// ORDEN ASCENDENTE
// Collections.sort(NombreLista,(ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto1.getAtriutoPaComparar().compareTo(objeto2.getAtriutoPaComparar()));
    
// ORDEN DESCENDENTE
//Collections.sort(NombreLista,(ClaseAtributos objeto1, ClaseAtributos objeto2) -> objeto2.getAtributoAComparar).compareTo(objeto1.getAtriutoPaComparar()));
    
    public void ordenarDuracionDesc(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula objeto1, Pelicula objeto2) -> objeto2.getDuración().compareTo(objeto1.getDuración()));

        System.out.println("Las películas ordenadas por su duración de manera descendente es: " + "\n");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }
    
    public void ordenarDuracionAsc(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas, (Pelicula objeto1, Pelicula objeto2) -> objeto1.getDuración().compareTo(objeto2.getDuración()));

        System.out.println("Las películas ordenadas por su duración de manera ascendente es: " + "\n");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }
    
    public void ordenarTitulo(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, (Pelicula p1, Pelicula p2) -> p1.getTítulo().compareTo(p2.getTítulo()));
        System.out.println("La lista ordenadas por título de manera alfabetica es :" + "\n");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }
    
    public void ordenarDirector(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas,(Pelicula p1,Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));
        System.out.println("La lista ordenadas por director de manera alfabetica es :" + "\n");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
}
