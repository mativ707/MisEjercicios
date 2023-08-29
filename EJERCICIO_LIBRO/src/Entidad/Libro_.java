
package Entidad;

import java.util.Scanner;

public class Libro_ {

    public String titulo,autor;
    public int númeroDePáginas, ISBN;

    public Libro_() {
    }
    
    public Libro_(int ISBN, String titulo, String autor, int númeroDePáginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.númeroDePáginas = númeroDePáginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNúmeroDePáginas(int númeroDePáginas) {
        this.númeroDePáginas = númeroDePáginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    
    //  EL SET ES PARA DEFINIR LOS ATRIBUTOS SI SON PRIVADOS
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNúmeroDePáginas() {
        return númeroDePáginas;
    }

    public int getISBN() {
        return ISBN;
    }
    
    
    
    public void cargaLibro(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN del libro");
        ISBN = leer.nextInt();
        
        System.out.println("Ingrese el título del libro");
        titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro");
        autor = leer.next();
        
        System.out.println("Ingrese el número de páginas del libro");
        númeroDePáginas = leer.nextInt();
          
    }
    
    public void mostrarDatos(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + númeroDePáginas);
    }
}
