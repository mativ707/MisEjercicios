
package Entidades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Libro {
    String titulo;
    String autor;
    Integer numEjemp;
    Integer numPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numEjemp, Integer numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemp = numEjemp;
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumEjemp() {
        return numEjemp;
    }

    public Integer getNumPrestados() {
        return numPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumEjemp(Integer numEjemp) {
        this.numEjemp = numEjemp;
    }

    public void setNumPrestados(Integer numPrestados) {
        this.numPrestados = numPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemp=" + numEjemp + ", numPrestados=" + numPrestados + '}';
    }
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    // MÉTODOS
    public void prestamo(HashSet <Libro> libros){
        Iterator <Libro> it = libros.iterator();
        System.out.print("Ingrese el título del libro que quiere prestar: ");
        String busq = leer.next().toUpperCase();
        boolean valid = false; // SE INICIA CON FALSE YA QUE NO SE REALIZÓ LA OPERACIÓN AÚN
        
        while (it.hasNext()) {
            Libro lib = it.next();
            if(lib.getTitulo().equalsIgnoreCase(busq)){
               Integer ejem = lib.getNumEjemp();
               if(ejem >= 1){
                   lib.setNumPrestados(lib.getNumPrestados()+1); // Se suma la cantidad de ejemplares prestados en una unidad.
                   lib.setNumEjemp(lib.getNumEjemp()-1); // Se resta la cantidad de ejemplares por el préstamo.
                   System.out.println("Se prestó 1(uno) ejemplar correctamente!");
                   valid = true; // SI SE PUDO REALIZAR LA OPERACIÓN
               }else if(ejem==0){
                   System.out.print("El número de ejemplares no es suficiente para "
                           + "realizar el préstamo");
               }
            }
        }
        System.out.println("RESULTADO: " + valid);
    }
    
    public void devolucion(HashSet <Libro> libros){
        Iterator <Libro> it = libros.iterator();
        System.out.print("Ingrese el título del libro que quiere devolver: ");
        String busq = leer.next().toUpperCase();
        boolean valid = false; // SE INICIA CON FALSE YA QUE NO SE REALIZÓ LA OPERACIÓN AÚN
        
        while (it.hasNext()) {
            Libro lib = it.next();
            if(lib.getTitulo().equalsIgnoreCase(busq)){
               Integer ejemPrestados = lib.getNumPrestados();
               if(ejemPrestados >= 1){
                   lib.setNumEjemp(lib.getNumEjemp()+1); // Se suma la cantidad de ejemplares en una unidad.
                   lib.setNumPrestados(lib.getNumPrestados()-1); // Se resta la cantidad de préstamos por la devolución.
                   System.out.print("Ingresó 1(uno) por DEVOLUCIÓN de ejemplar correctamente!");
                   valid = true; // SI SE PUDO REALIZAR LA OPERACIÓN
               }else if(ejemPrestados==0){
                   System.out.println("El número de ejemplares prstados no es suficiente para "
                           + "realizar la devolución");
               }
            }
        }
        System.out.println("RESULTADO: " + valid);
    }
    
    public void mostrarLibreria(HashSet <Libro> libros){
        System.out.println("LISTA DE LIBROS:");
        for (Libro aux : libros){
            System.out.println(aux.toString());
        }
    }
}
