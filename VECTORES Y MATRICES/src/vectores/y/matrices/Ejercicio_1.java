/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package vectores.y.matrices;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        int vector[] = new int [100]; // SE INICIALIZA EL VECTOR
        
        for(int j = 0; j < 100 ; j++){
            vector[j] = j+1;
        }
        
        for(int j = 99; j >= 0; j--){
            System.out.println(vector[j]);
        }
    }
    
}
