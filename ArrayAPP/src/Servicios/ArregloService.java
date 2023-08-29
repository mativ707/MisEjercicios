
package Servicios;

import java.util.Arrays;

public class ArregloService {
    public void inicializarA(double[] A){
        
        for (int j = 0; j < A.length; j++) {
            A[j] = Math.random() * 100;
        }
    }
    
    public void mostrar(double[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar(double[] A){
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
    }
    
    public void inicializarB(double[] B, double[] A){
        for (int j = 0; j < 9; j++) {
            B[j] = A[j];
        }
        for (int i = 9; i < B.length; i++) {
            B[i] = 0.5;
        }
    }
}
