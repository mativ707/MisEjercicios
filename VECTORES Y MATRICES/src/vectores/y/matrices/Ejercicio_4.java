/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package vectores.y.matrices;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        int matriz[][] = new int [3][3];
        
        for(int j = 0 ; j<3; j++){
            for(int i = 0; i < 3; i++){
                matriz[j][i] = (int)(Math.random()*10); 
            }         //FINAL DEL SEGUNDO FOR
            
        }
        //FINAL DEL PRIMER FOR
        System.out.println("MATRIZ: ");
        System.out.println("");
        
        for(int j = 0; j<3;j++){
            for(int i = 0; i<3;i++){
                System.out.print(matriz[j][i]);
            }
            System.out.println(""); //AQUÍ DEBE SER PRINTLN PARA PONER ESPACIO(ENTER)
        }
        
        System.out.println("");
        System.out.println("SU TRANSPUESTA ES: ");
        System.out.println("");
        
        for(int j = 0; j<3;j++){
            for(int i = 0; i<3;i++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(""); //AQUÍ DEBE SER PRINTLN PARA PONER ESPACIO(ENTER)
        }
    }
    
}
