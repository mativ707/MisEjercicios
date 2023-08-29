/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package vectores.y.matrices;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
       int matriz[][] = new int [3][3];
       int traspuesta[][] = new int[3][3];
       
       Scanner leer = new Scanner(System.in);       
        
        for(int j = 0 ; j<3; j++){
            for(int i = 0; i < 3; i++){
                System.out.println("Ingrese el elemento " +j+","+i+" de la matriz");
                matriz[j][i] = leer.nextInt(); 
            }         //FINAL DEL SEGUNDO FOR
            
        } //FINAL DEL PRIMER FOR
        
        System.out.println("MATRIZ: ");
        System.out.println("");
        
        for(int j = 0; j<3;j++){
            for(int i = 0; i<3;i++){
                System.out.print(matriz[j][i]);
            }
            System.out.println(""); //AQUÍ DEBE SER PRINTLN PARA PONER ESPACIO(ENTER)
        }
        
        System.out.println("");
        System.out.println("SU TRASPUESTA ES: ");
        System.out.println("");
        
        for(int j = 0; j<3;j++){
            for(int i = 0; i<3;i++){
                System.out.print(matriz[i][j]);
                traspuesta[j][i] = matriz[i][j];
            }
            System.out.println(""); //AQUÍ DEBE SER PRINTLN PARA PONER ESPACIO(ENTER)
        }
        
        int contador = 0;
        
        for (int j=0;j<3;j++){
            for(int i = 0;i<3;i++){
                if(matriz[j][i]==(-traspuesta[j][i])){
                    contador = 0;
                }else{
                    contador = 1;
                    j=2;
                    i=2;
                }
            }
            if(contador == 0){
                System.out.println("");
                System.out.println("La matriz tiene antisimetrica en su traspuesta");
            }else{
                System.out.println("");
                System.out.println("Se comprueba que la matriz traspuesta no es antisimétrica");
            }
            
        }
        
    }
    
}
