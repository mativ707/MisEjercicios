//    Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

package Servicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesService {
    HashSet <String> paises = new HashSet();
    Scanner leer = new Scanner(System.in);
    
    
    public void agregarPais(HashSet<String> paises) {
        // HACEMOS UN BUCLE INFINITO HASTA QUE LOGREMOS EL "BREAK"
        while (true) {
            System.out.println("Ingrese el país a agregar: ");
            String pais = leer.nextLine();
            paises.add(pais);
            System.out.println("Se guardó el país.");
            System.out.println("Desea continuar agregando paises? S/N");
            String salir = leer.nextLine();
            // AQUI ROMPEMOS EL BUCLE INFINITO
            if (salir.equalsIgnoreCase("N")){
                System.out.println("Los paises guardados son los siguientes: ");
                for (String aux : paises) {
                    System.out.println(aux);
                }
                break;
            }
        }  
        System.out.println("\n");
    }
    
    public void ordenarPaises(HashSet <String> paises){
        // AQUI CONVERTIMOS EL HASH EN TREE PARA ORDENARLO
        TreeSet<String> paisesOrdenados = new TreeSet(paises);
        System.out.println("La lista de paises ordenados afabeticamente es: ");
        for (String aux : paisesOrdenados) {
            System.out.println(aux);
        }
        System.out.println("\n");
    }
    
    public void eliminarPais(HashSet <String> paises){
        Iterator <String> it = paises.iterator(); // EL ITERATOR DEBE IR DENTRO DEL METODO PARA QUE FUNCIONE
        System.out.println("Ingrese el pais a eliminar de la lista: ");
        String paisBuscado = leer.nextLine();
        boolean validacion = true;
        
        while (it.hasNext()){
            if(it.next().equals(paisBuscado)){
                it.remove();
                validacion = false;
            }
        }
        // Validamos que si no se eliminó el país se le informe al usuario.
        if(validacion){
            System.out.println("El país no fue encontrado en la lista.");
        }else{
            System.out.println("Pais eliminado.");
        }
        System.out.println("Paises restantes: ");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }
}
