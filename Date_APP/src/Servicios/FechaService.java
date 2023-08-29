
package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        int dia,mes,año;
        
        System.out.println("Ingrese fecha de nacimiento:");
        System.out.println("DIA:");
        dia = leer.nextInt();
        System.out.println("MES:");
        mes = leer.nextInt();
        System.out.println("AÑO:");
        año = leer.nextInt();
        
        // AÑO SE LE RESTA 1900 PORQUE LE SUMA DESDE 1900
        // SE RESTA 1 MES PORQUE EMPIEZA DESDE 0
        Date fechaNac = new Date(año-1900,mes-1,dia);
        
        System.out.println("Su fecha de nacimiento es: " + fechaNac);
        System.out.println("\n");
        return fechaNac;
    }
    
    public Date fechaActual(){
        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + fechaActual);
        System.out.println("\n");
        
        return fechaActual;
    }
    
    public int diferencia(Date fechaNac, Date fechaActual){
        int edad = fechaActual.getYear() - fechaNac.getYear();
        
        //if(fechaActual.getMonth() < fechaNac.getMonth()){
            //edad--;
        //}else if(fechaActual.getMonth() == fechaNac.getMonth() && fechaActual.getDay() < fechaNac.getDay()){
            //edad--;
        //}
            
        return edad;
    }
}
