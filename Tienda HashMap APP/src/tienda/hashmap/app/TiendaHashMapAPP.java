
package tienda.hashmap.app;

import Servicios.TiendaService;
import java.util.HashMap;
import java.util.Scanner;

public class TiendaHashMapAPP {

    public static void main(String[] args) {
        HashMap <String, Integer> productos = new HashMap<>();
        TiendaService ts = new TiendaService();
        boolean salir = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        while(salir){
            System.out.println("\n"+"TIENDA APP");
            System.out.println("1.Agregar Productos");
            System.out.println("2.Modificar precios");
            System.out.println("3.Eliminar producto");
            System.out.println("4.Mostrar lista de productos");
            System.out.println("5.Salir");
            Integer resp = leer.nextInt();
            switch (resp) {
                case 1:
                    ts.agregarProducto(productos);
                    break;
                case 2:
                    ts.modificarPrecio(productos);
                    break;
                case 3:
                    ts.eliminarProducto(productos);
                    break;
                case 4:
                    ts.mostrarProductos(productos);
                    break;
                case 5:
                    salir = false;
                    break;
            }
        }
    }
    
}
