
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class MesesService {
    Meses m1 = new Meses();
    Scanner leer = new Scanner(System.in);
    
    public void llenarArray(){
        String [] mesesLleno = new String[12];
        
        mesesLleno[0]="enero";
        mesesLleno[1]="febrero";
        mesesLleno[2]="marzo";
        mesesLleno[3]="abril";
        mesesLleno[4]="mayo";
        mesesLleno[5]="junio";
        mesesLleno[6]="julio";
        mesesLleno[7]="agosto";
        mesesLleno[8]="septiembre";
        mesesLleno[9]="octubre";
        mesesLleno[10]="noviembre";
        mesesLleno[11]="diciembre";
        
        m1.setMesSecreto(mesesLleno[9]);
        m1.setMeses(mesesLleno);
    } 
    
    public void adivinar(){
        System.out.println("Adivine el mes secreto:");
        System.out.println("------------------------");
        String respuesta = leer.next();
        
        do{
            if(respuesta.equals(m1.getMesSecreto())){
                System.out.println("CORRECTO! Adivinaste el mes secreto");
                break;
            }else{
                System.out.println("INCORRECTO! Intenta nuevamente");
                respuesta = leer.next();
            }
        }while(respuesta != m1.getMesSecreto());
    }
}
