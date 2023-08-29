package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {
    Cadena c1 = new Cadena();
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(){
        System.out.println("Ingrese la frase para la clase: ");
        c1.setFrase(leer.nextLine());
        System.out.println(c1.getLongitud());
        
        int vocales = 0;
        System.out.println(c1.getFrase()+ "\n");
        
        for(int j = 0; j < c1.getFrase().length();j++){
            char c = c1.getFrase().toLowerCase().charAt(j);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vocales++;
            }
        }
        
        System.out.println("La frase tiene "+ vocales + " vocal/es.");
    }
    
    public void invertirFrase(){
        //deberá invertir la frase ingresada y mostrarla
        //por pantalla. Por ejemplo: Entrada: "casa blanca", 
        //Salida: "acnalb asac".
        
        
        // StringBuilder en Java es una clase utilizada para crear una sucesión 
        // de caracteres mutable, o en otras palabras, modificable. Al igual que 
        // StringBuffer, la clase StringBuilder es una alternativa a la clase 
        // Java Strings, ya que la clase Strings proporciona una sucesión inmutable de caracteres. 
        // Sin embargo, hay una diferencia significativa entre StringBuffer y StringBuilder, y es 
        // que este último no está sincronizado. Esto significa que StringBuilder en Java es una 
        // opción más adecuada cuando se trabaja con un solo hilo, ya que será más rápido que StringBuffer.
        
       String frase = c1.getFrase();
        StringBuilder sb = new StringBuilder(frase);
        System.out.println("-------------------------------");
        System.out.println("La frase invertida es: " + sb.reverse().toString()); //SE USA SB REVERSE
        
    }
    
    public void vecesRepetido(String letra){
        String frase = c1.getFrase().toLowerCase();
        char ch = letra.toLowerCase().charAt(0);
        int count = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("El carácter '" + letra + "' se repite " + count + " veces.");
    }
    
    public void compararLongitud(String frase2){
        System.out.println("La longitud de la frase en clase es de " + c1.getLongitud());
        System.out.println("La longitud de la frase ingresada por usuario es de " + frase2.length());
        
        if(c1.getLongitud() > frase2.length()){
            System.out.println("La frase de la clase tiene MAYOR longitud que la ingresada por usuario");
        }else{
            System.out.println("La frase de la clase tiene MENOR longitud que la ingresada por usuario");
        }
    }
    
    public void unirFrases(String Frase){
        System.out.println(c1.getFrase() + " " + Frase);
    }
    
    public void reemplazar(String letra){
       String frase = c1.getFrase().replace("a",letra);
        System.out.println("-------------------------------");
        System.out.println("La frase resultante es: " + frase);
    }
    
    
     public boolean contiene(String letra) {
        return c1.getFrase().toLowerCase().contains(letra.toLowerCase());
    }
    
    }
    
    

