
package cafeterapp;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

public class CafeterAPP {

    public static void main(String[] args) {
        Cafetera cf = new Cafetera();
        CafeteraServicio cfs = new CafeteraServicio();
        boolean salir = false;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("NESPRESSO APP");
            System.out.println("\n");
            System.out.println("1.Llenar cafetera");
            System.out.println("2.Servir taza");
            System.out.println("3.Vaciar cafetera");
            System.out.println("4.Agregar café");
            System.out.println("5.Salir");
            
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    cfs.llenarCafetera();
                    break;
                case 2:
                     System.out.println("Ingrese tamaño de taza vacía:");
                     int tamañoTaza = leer.nextInt();
                     cfs.servirTaza(tamañoTaza);
                    break;
                case 3:
                    cfs.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Ingrese cantidad correcta de café a cargar: ");
                    int ingrCafé;
                    do {
                        ingrCafé = leer.nextInt();
                        if(ingrCafé > cf.getCapMax() || ingrCafé+cf.getCantActual() > cf.getCapMax()){
                        System.out.println("La cantidad de café supera la capacidad de la cafetera");
                        System.out.println("Por favor ingrese un valor válido.");
                    }
                    }while(ingrCafé > cf.getCapMax());
                    cfs.agregarCafé(ingrCafé);
                    break;
                    
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }while(salir == false);
        
        
    }
    
}
