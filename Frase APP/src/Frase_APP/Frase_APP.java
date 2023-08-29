
package Frase_APP;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

public class Frase_APP {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Cadena c1 = new Cadena();
        CadenaServicios cs = new CadenaServicios();
        boolean salir = true;
        String frase2;
        
        do{
            
            System.out.println("Frases APP");
            System.out.println("1.Mostrar vocales");
            System.out.println("2.Invertir frase");
            System.out.println("3.Veces repetido");
            System.out.println("4.Comparar longitud");
            System.out.println("5.Unir frases");
            System.out.println("6.Reemplazar letra");
            System.out.println("7.Si contiene...");
            System.out.println("8.Salir");
            
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    cs.mostrarVocales();
                    break;
                case 2:
                    cs.invertirFrase();
                    break;
                case 3:
                    System.out.println("Ingrese el caracter que desea contabilizar su repetición en la frase.");
                    String letra = leer.next();
                    cs.vecesRepetido(letra);
                    break;
                case 4:
                    System.out.println("Ingrese la frase para poder compararla");
                    frase2 = leer.next();
                    cs.compararLongitud(frase2);
                    break;
                case 5:
                    System.out.println("Ingrese la frase que desea unir a la frase anterior.");
                    cs.unirFrases(leer.next());
                    break;
                case 6:
                    System.out.println("Ingrese la letra que desea reemplazar por todas las letras 'a' que se encuentren en la frase."  );
                    letra = leer.next();
                    cs.reemplazar(letra);
                    break;
                case 7:
                    System.out.println("===============================");
                    System.out.print("Ingrese una letra para comprobar si la frase la contiene: ");
                    letra = leer.next();
                    boolean contiene = cs.contiene(letra);
                    if (contiene) {
                    System.out.println("La frase contiene la letra " + letra);
                    } else {
                      System.out.println("La frase NO contiene la letra " + letra);
                      System.out.println("===============================");
                    }
                    
                    break;
                case 8:
                    salir = false;
                    break;
            }
            
        }while(salir == true);
        
    }
    
}
