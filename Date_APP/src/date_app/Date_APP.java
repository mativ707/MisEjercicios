
package date_app;

import Entidades.Persona;
import Servicios.FechaService;
import Servicios.PersonaService;
import java.util.Date;
import java.util.Scanner;

public class Date_APP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        FechaService fs = new FechaService();
        PersonaService ps = new PersonaService();
        
        Date fechaNac = fs.fechaNacimiento();
        Date fechaActual = fs.fechaActual();
        int diferenciaEdad = fs.diferencia(fechaActual, fechaNac);
        System.out.println("La diferencia de la fecha actual y la fecha de nacimiento es " + diferenciaEdad*-1);
        
        // PUNTO 5
        
        // CREAMOS PERSONA
        ps.crearPersona();
        
        // CALCULAMOS EDAD
        ps.calcularEdad();
        
        // COMPROBAMOS QUE SEA MENOR
        Persona p2 = new Persona();
        p2 = ps.crearPersona();
        System.out.println("Ingrese edad a comparar: ");
        int Edad = leer.nextInt();
        boolean resp = ps.menorQue(p2, Edad);
        
        System.out.println(resp);
        
        // MOSTRAMOS A LA PERSONA
        System.out.println(ps.mostrarPersona().toString());
        
    }
    
}
