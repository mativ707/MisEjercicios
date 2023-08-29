/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido.
 */
package vectores.y.matrices;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector:");
        int n;
        n = leer.nextInt();
        
        int vector[] = new int [n];
        
        for(int j = 0; j<n; j++){
            vector[j]=(int)(Math.random() * 10);//PARA COLOCAR NÚMEROS ALEATORIOS DEL 0 AL 10
        }
        
        for(int j = 0 ; j<n; j++){
            System.out.println(vector[j]);
        }
        
        System.out.println("Ingrese un número a buscar en el vector");
            int busq, contador;
            busq = leer.nextInt();
            contador=0;
            
            for(int j=0; j<n; j++){
                if(vector[j]==busq){
                    contador = contador+1;
                    System.out.println("El número "+busq+" se encuentra en la posición "+j);
                }
        }
        if(contador != 0){
            System.out.println("El número "+busq+" se repite "+ contador+" vez/veces");
        }else{
            System.out.println("El número ingresado no se encuentra en el vector.");
        }
        
    }
    
}
