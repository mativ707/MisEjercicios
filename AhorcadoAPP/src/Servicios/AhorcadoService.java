
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Ahorcado ju = new Ahorcado();
    Scanner leer = new Scanner(System.in);
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra para jugar:");
        String palabra = leer.next().toLowerCase(); //LA HACEMOS MINÚSCULAS PARA EVITAR ERRORES
        
        //SE LE DA LONGITUD AL VECTOR
        char[] vector = new char [palabra.length()];
        
        
        //LLENAMOS EL VECTOR CON CADA LETRA DE LA PALABRA
        for(int j=0 ; j < palabra.length();j++){
            vector[j] = palabra.charAt(j);
        }
        ju.setPalabra(vector);
        
        //AGREGAMOS CANTIDAD DE INTENTOS MÁXIMOS
        System.out.println("Ingrese la cantidad de jugadas máximas permitidas:");
        ju.setJugadasMax(leer.nextInt());
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es :" + ju.getPalabra().length);
    }
    
    public boolean buscarLetra(char letra){
        boolean letraEncontrada = false;
        char vector[] = ju.getPalabra();
        
        for(int j = 0 ; j < vector.length;j++){
            if(letra == vector[j]){
                letraEncontrada = true;
                break;
            }
        }
        
        if(letraEncontrada){
            System.out.println("La letra pertenece a la palabra");
        }else{
            System.out.println("La letra NO pertenece a la palabra");
        }
        
        return letraEncontrada;
    }
    
    public boolean encontradas(char letra){
        boolean letraEncontrada = buscarLetra(letra);
        char vector[] = ju.getPalabra();
        
        if (letraEncontrada) {
            for (int i = 0; i < ju.getPalabra().length; i++) {
                if (letra == vector[i]) {
                    letraEncontrada = true;
                    ju.setLetrasEncontradas(ju.getLetrasEncontradas() + 1);
                }
            }
        } else {
            ju.setJugadasMax(ju.getJugadasMax() - 1);
            intentos();
        }
        
        int faltantes = ju.getPalabra().length - ju.getLetrasEncontradas();
        System.out.println("Faltan " + faltantes + " letras");
        
        return letraEncontrada;
    }
    
    public void intentos(){
        System.out.println("La cantidad de intentos disponibles es de "+ ju.getJugadasMax() + " intentos");
    }
    
    public void juego(){
        crearJuego();
        longitud();
        boolean finDeIntentos;
        boolean palabraEncontrada;
        
        do {
            System.out.println("Ingrese la letra a buscar");
            char letra = leer.next().charAt(0);
            encontradas(letra);
            finDeIntentos = ju.getJugadasMax() > 0;
            palabraEncontrada = ju.getLetrasEncontradas() == ju.getPalabra().length;
            
            if (palabraEncontrada) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Felicidades!! Ganaste");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            } else if (!finDeIntentos) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Perdiste!! :c");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            }
        } while (true);  
    }
}
