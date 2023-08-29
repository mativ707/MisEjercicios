
package colecciones.extra.ej.pkg3;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class ColeccionesExtraEj3 {
//    3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
//datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
//información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
//el título del libro, autor, número de ejemplares y número de ejemplares prestados.
//También se creará en el main un HashSet de tipo Libro que guardará todos los libros
//creados.
//En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
//sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
//se le pregunta al usuario si quiere crear otro Libro o no.
//La clase Librería contendrá además los siguientes métodos:
//• Constructor por defecto.
//• Constructor con parámetros.
//• Métodos Setters/getters
//• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
//busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
//método. El método se incrementa de a uno, como un carrito de compras, el
//atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
//cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
//que no queden ejemplares disponibles para prestar. Devuelve true si se ha
//podido realizar la operación y false en caso contrario.
//• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
//lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
//El método decrementa de a uno, como un carrito de compras, el atributo
//ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
//vez que se produzca la devolución de un libro. No se podrán devolver libros
//donde que no tengan ejemplares prestados. Devuelve true si se ha podido
//realizar la operación y false en caso contrario.
//• Método toString para mostrar los datos de los libros.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro lib = new Libro();
        HashSet <Libro> libros = new HashSet<>();
        boolean salir = true;
        String titulo;
        String autor;
        Integer numEjemp;
        
        while(salir){
            System.out.print("Ingrese el nombre del libro a agregar: ");
            titulo = leer.next().toUpperCase();
            System.out.print("Ingrese el autor del libro "+titulo+" ");
            autor = leer.next();
            System.out.print("Ingrese el número de ejemplares del libro "+titulo+" ");
            numEjemp = leer.nextInt();
            libros.add(new Libro(titulo, autor, numEjemp,0));
            System.out.print("Se añadió "+ titulo + " correctamente!");
            System.out.println(" Desea agregar otro libro? S/N");
            String resp = leer.next();
            if(resp.equals("N") || resp.equals("n")){
                salir = false;
            }
        }
        boolean salir2 = true;
        
        while(salir2){
            System.out.println("1.Realizar préstamo.");
            System.out.println("2.Realizar devolución.");
            System.out.println("3.Mostrar librería");
            System.out.println("4.Salir");
            int resp = leer.nextInt();
            
            switch(resp){
                case 1:
                    lib.prestamo(libros);
                    break;
                case 2:
                    lib.devolucion(libros);
                    break;
                case 3:
                    lib.mostrarLibreria(libros);
                    break;
                case 4:
                    salir2 = false;
                    break;
            }
        }
    }
}
