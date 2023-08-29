/*
 * BlackMadia#1443
 */

package Ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Cine {
    
    public static void main(String[] args) {
        
        List<Pelicula> listaPeliculas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean crearOtraPelicula = true;
        
        while (crearOtraPelicula) {
            System.out.println("Ingrese el título de la película:");
            String titulo = scanner.nextLine();
            
            System.out.println("Ingrese el director de la película:");
            String director = scanner.nextLine();
            
            System.out.println("Ingrese la duración de la película (en horas):");
            double duracion = Double.parseDouble(scanner.nextLine());
            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(pelicula);
            
            System.out.println("¿Desea crear otra película? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                crearOtraPelicula = false;
            }
        }
        
        // Mostrar todas las películas
        System.out.println("---------------------------------------------------");
        System.out.println("Todas las películas:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        
        // Mostrar las películas con duración mayor a 1 hora
        System.out.println("---------------------------------------------------");
        System.out.println("Películas con duración mayor a 1 hora:");
        listaPeliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1.0)).forEachOrdered((pelicula) -> {
            System.out.println(pelicula);
        });
        
        // Ordenar las películas por duración (de mayor a menor) y mostrar
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDuracion).reversed());
        System.out.println("---------------------------------------------------");
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        
        // Ordenar las películas por duración (de menor a mayor) y mostrar
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDuracion));
        System.out.println("---------------------------------------------------");
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        
        // Ordenar las películas por título y mostrar
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("---------------------------------------------------");
        System.out.println("Películas ordenadas por título:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        
        // Ordenar las películas por director y mostrar
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("---------------------------------------------------");
        System.out.println("Películas ordenadas por director:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("---------------------------------------------------");
    }
    
}
