
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());
        
        Date fechaNac = p1.getFechaNac();
        
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = leer.nextInt();
        fechaNac.setDate(dia);
        
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        fechaNac.setMonth(mes-1);
        
        System.out.println("Ingrese el año de nacimiento: ");
        int año = leer.nextInt();
        fechaNac.setYear(año-1900);
        
        
        return p1;
    }
    
    public int calcularEdad(){
        int edad;
        Date fechaActual = new Date(); // AQUI SE CREA LA FECHA ACTUAL
        
        edad = fechaActual.getYear() - p1.getFechaNac().getYear();
        System.out.println("La edad de " + p1.getNombre() + " es " + edad + "\n");
        
        return edad;
    }
  
    public boolean menorQue(Persona p1, int edad){
        boolean menor = true;
        int edadp2 = calcularEdad();
        
        
        if(edad < edadp2){
          menor = true;
        }else{
          menor = false;
        }
        
        return menor;
    }
    
    public Persona mostrarPersona(){
        return p1;
    }
}
