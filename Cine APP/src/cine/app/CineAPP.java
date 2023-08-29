
package cine.app;

import Entidades.Pelicula;
import Servicios.PeliculaService;
import java.util.ArrayList;

public class CineAPP {

    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList();
        PeliculaService ps = new PeliculaService();
        
        ps.creadorPeliculas(peliculas);
        ps.mostrarPeliculas(peliculas);
        ps.ordenarDuracionAsc(peliculas);
        ps.ordenarDuracionDesc(peliculas);
        ps.ordenarTitulo(peliculas);
        ps.ordenarDirector(peliculas);
    }
    
}
