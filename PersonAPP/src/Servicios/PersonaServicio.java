
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(){
        boolean mayor = true;
        
        try{
            if (p1.getEdad() >= 18) {
                System.out.println(mayor);
            } else {
                mayor = false;
                System.out.println(mayor);
            }
        }catch(Exception e){
            System.out.println("ocurrio un error");
            System.out.println(e.getMessage());
        }
        return mayor;
}
    
    public void crearPersona(){
        System.out.println("Ingrese nombre de la persona: ");
        p1.setNombre(leer.next());

        System.out.println("Ingrese sexo de la persona:");
        System.out.println("H(hombre), M(mujer), O(otros)");
        p1.setSexo(leer.next());
        System.out.println(p1.getSexo());

        System.out.println("Ingrese edad de la persona: ");
        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese peso de la persona: ");
        p1.setPeso(leer.nextDouble());

        System.out.println("Ingrese altura de la persona: ");
        p1.setAltura(leer.nextDouble());
        
        p1 = null;
    }
    
    public int calcularIMC(){
        double pesoIdeal;
        int funcion;
        
        pesoIdeal = p1.getPeso()/ Math.pow(p1.getAltura(),2);
        
        if (pesoIdeal < 20){
            // DEBAJO DEL PESO IDEAL
            funcion = -1;
        }else if(pesoIdeal >= 20 || pesoIdeal <= 25){
            // EN PESO IDEAL
            funcion = 0;
        }else{
            // SOBREPESO
            funcion = 1;
        }
        return funcion;
    }
    
   
//Por último, guardaremos los resultados de los métodos calcularIMC y 
//esMayorDeEdad en distintas variables(arrays), para después calcular un
//porcentaje de esas 4 personas cuantas están por debajo de su peso,
//cuantas en su peso ideal y cuantos, por encima, y también calcularemos
//un porcentaje de cuantos son mayores de edad y cuantos menores. Para
//esto, podemos crear unos métodos adicionales.
    
    
    public void porcentajeMayor(int[]mayorEdad){
        int mayores = 0; // Para conteo de personas por grupo.
        int menores = 0;
        
        for(int j = 0; j < 4 ; j++){
            if(mayorEdad[j]==1){
             mayores++;   
            }else{
             menores++;
            }
        }
        
        System.out.println("El porcentaje de menores es del "+ (menores*100)/4 + "%");
        System.out.println("El porcentaje de mayores es del "+ (mayores*100)/4 + "%");
    }
    
    public void porcentajeDePeso(int[]IMC){
        int ideal = 0;
        int sobrepeso = 0;
        int bajopeso = 0;
        
        for(int j = 0; j < 4 ; j++){
            if(IMC[j]==0){
             ideal++;   
            }else if(IMC[j]==-1){
             bajopeso++;
            }else if(IMC[j]==1){
             sobrepeso++;
            }
        }
        
        System.out.println("El porcentaje de personas en peso ideal es de "+ (ideal*100)/4 + "%");
        System.out.println("El porcentaje de personas con sobrepeso es de "+ (sobrepeso*100)/4 + "%");
        System.out.println("El porcentaje de personas con bajo peso es de "+ (bajopeso*100)/4 + "%");
        
    }
}
