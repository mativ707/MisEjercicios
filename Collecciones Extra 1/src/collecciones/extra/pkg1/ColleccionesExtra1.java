
package collecciones.extra.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class ColleccionesExtra1 {
// 1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
//y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        boolean salir = true;
        Integer num;
        Integer suma = 0;
        int contador = 0;
        
        while(salir){
            System.out.println("Ingrese el número que desea agregar a la lista: ");
            System.out.println("-99 = SALIR");
            num = leer.nextInt();
            if(num!= -99){
                numeros.add(num);
                suma += num;
                contador++;
            }else{
                salir = false;
            }
        }
            if(contador!= 0){
                System.out.println("Los valores ingresados son los siguientes:");
            for (Integer aux : numeros) {
                System.out.println(aux);
        }
            System.out.println("La suma de los valores ingresados es de " + suma);
            System.out.println("El promedio de los valores ingresados es de " + suma/contador);
            }
    }  
}
