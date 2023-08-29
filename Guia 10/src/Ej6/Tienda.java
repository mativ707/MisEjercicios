/*
 * 
 */
package Ej6;

import java.util.HashMap;
import java.util.Scanner;

public class Tienda {

    private HashMap<String, Double> productos;
    private Scanner scanner;

    public Tienda() {
        productos = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer de entrada
        productos.put(nombre, precio);
        System.out.println("Producto agregado correctamente.");
    }

    public void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer de entrada
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (String nombre : productos.keySet()) {
                System.out.println(nombre + " - Precio: " + productos.get(nombre));
            }
        }
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n---- TIENDA ----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.mostrarMenu();
    }
}



