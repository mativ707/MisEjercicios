package Main;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        boolean salir = true;
        int persona = 0;
        int IMC[] = new int [4];
        int mayorEdad[] = new int [4];
        
        
        
        do{
            System.out.println("");System.out.println("PersonAPP"+"\n");
            System.out.println("");System.out.println("1.Crear persona"+"\n");
            System.out.println("");System.out.println("2.Comprobar si la persona es mayor de edad"+"\n");
            System.out.println("");System.out.println("3.Calcular IMC"+"\n");
            System.out.println("");System.out.println("4.Calcular porcentajes"+"\n");
            System.out.println("");System.out.println("5.Salir"+"\n");
          
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    ps.crearPersona();
                    break;
                case 2:
                    ps.esMayorDeEdad();
                    guardaMayor(mayorEdad, persona);
                    break;
                case 3:
                    ps.calcularIMC();
                    guardarIMC(IMC, persona);
                    break;
                case 4:
                    ps.porcentajeMayor(mayorEdad);
                    ps.porcentajeDePeso(IMC);
                    break;
                case 5:
                    salir = false;
                    break;
            }
            persona++;
            
        }while(salir == true);
        
    } 
    
    public static void guardarIMC(int[]IMC,int persona){
        PersonaServicio ps = new PersonaServicio();
        IMC[persona] = ps.calcularIMC();
}
    
    public static void guardaMayor(int[]mayorEdad,int persona){
        PersonaServicio ps = new PersonaServicio();
        
        if(ps.esMayorDeEdad()==true){
            mayorEdad[persona] = 1;
        } else{
            mayorEdad[persona] = 0;
        }
}
}



