
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    Cafetera cf1 = new Cafetera();
    
    public void llenarCafetera(){
        System.out.println("Llenando cafetera...");
        cf1.setCantActual(cf1.getCapMax());
        System.out.println(cf1.getCantActual());
    }
    
    public void servirTaza(int tamañoTaza){
        System.out.println("Sirviendo..."+"\n");
        int taza = 0;
        
        if(cf1.getCantActual() <= tamañoTaza){
            taza = cf1.getCantActual();
            cf1.setCantActual(0);
            
            System.out.println("La taza no se llenó y quedó al " + taza + " en cantidad.");
        }else if(cf1.getCantActual() > tamañoTaza){
            taza = tamañoTaza;
            cf1.setCantActual(cf1.getCantActual() - tamañoTaza);
            System.out.println("La taza se llenó correctamente.");
        }
    }
    
    public void vaciarCafetera(){
        System.out.println("Vaciando cafetera...");
        cf1.setCantActual(0);
    }
    
    public void agregarCafé(int ingrCafé){
        if(cf1.getCantActual() == cf1.getCapMax()){
            System.out.println("La cafetera ya se encuentra llena");
        }else{
            cf1.setCantActual(ingrCafé);
        }
    }
   
}
