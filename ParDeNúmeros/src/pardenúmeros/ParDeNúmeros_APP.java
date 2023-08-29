
package pardenúmeros;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class ParDeNúmeros_APP {
    
    public static void main(String[] args) {
        ParDeNumeros par = new ParDeNumeros();
        ParDeNumerosService pds = new ParDeNumerosService();
        
        // AQUI SE MUESTRAN LOS VALORES
        pds.mostrarValores();
        
        // AQUI SE DEVUELVE EL MAYOR
        pds.devolverMayor();
        
        // AQUI SE CALCULA LA POTENICA DEL MAYOR ELEVADO AL MENOR
        System.out.println("El mayor elevado al menor es igual a " + pds.calcularPotencia() + "\n");
        
        // AQUI SE CALCULA LA RAÍZ CUADRADA DEL MENOR
        System.out.println("La raíz cuadrada del menor es igual a " + pds.calcularRaiz() + "\n");
    }
    
}
