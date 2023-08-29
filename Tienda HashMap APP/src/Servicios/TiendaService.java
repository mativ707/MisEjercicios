//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    HashMap <String , Integer> productos = new HashMap<>();
    // En los HashMap va primero la llave
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarProducto(HashMap <String , Integer> productos){
        System.out.print("Ingrese el nombre del producto:");
        String name = leer.nextLine();
        System.out.print("Ingrese el precio del producto:");
        int precio = leer.nextInt();
        // Aqui se agrega al HashMap
        productos.put(name, precio);
        System.out.print("Agregado!");
        System.out.print("");
    }
    
    public void modificarPrecio(HashMap <String , Integer> productos){
        System.out.print("Ingrese el producto el cual desea modificar el precio:");
        String name = leer.nextLine();
        
        //El método .ContainsKey() recibe una llave dada por el usuario y revisa si la 
        //llave se encuentra en la lista o no. 
        //Si la llave se encuentra retorna verdadero y si no falso.
        if(productos.containsKey(name)){
            productos.remove(name);
            System.out.print("Producto encontrado. Ingrese el nuevo precio: ");
            int precio = leer.nextInt();
            productos.put(name, precio);
            System.out.print("Precio actualizado");
        }else{
            System.out.print("El producto no se encuentra en la lista.");
        }
        System.out.print("");
    }
    
    public void mostrarProductos(HashMap <String , Integer> productos){
        System.out.print("LISTA DE PRODUCTOS: ");
        for (Map.Entry <String, Integer> aux : productos.entrySet()) {
            System.out.print("PRODUCTO: " + aux.getKey() + " PRECIO: " + aux.getValue());
        }
        System.out.print("");
    }
    
    public void eliminarProducto(HashMap <String , Integer> productos){
        System.out.println("Ingrese el producto a eliminar del sistema: ");
        String name = leer.nextLine();
        if(productos.containsKey(name)){
            productos.remove(name);
            System.out.println("Removido!");
        }else{
            System.out.println("El producto no se encuentra en la lista.");
        }
       System.out.println(""); 
    }
}
