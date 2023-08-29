
package estructuras.de.control.java;

import java.util.Scanner;


public class Ejercicio_6 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Deberá ingresar DOS números enteros positivos");
        System.out.println("Ingrese el primer número:");
        int num1,num2, contador;
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = leer.nextInt();
        boolean quieroSalir = true;
        String sal;
        
        do {
            System.out.println("MENU");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
                   
            contador = 0;
            int opcion = leer.nextInt();
            
        switch (opcion) {
            case 1:
                System.out.println("La SUMA entre" + num1 + " y " + num2 + " es igual a: " + (num1+num2));
                break;
            case 2:
                System.out.println("La RESTA entre" + num1 + " y " + num2 + " es igual a: " + (num1-num2));
                break;
            case 3:
                System.out.println("La MULTIPLICACIÓN entre " + num1 + " y " + num2 + " es igual a: " + (num1*num2));
                break;
            case 4:
                System.out.println("La DIVISIÓN entre " + num1 + " y " + num2 + " es igual a: " + (num1/num2));
                break;
            case 5:{
                System.out.println("¿Está seguro que desea salir del programa");
                System.out.println("S/N)");
                sal = leer.nextLine().toUpperCase();
                
                if("S".equals(sal)){
                    quieroSalir = false;
                    System.out.println("Saliendo");
                } else {
                    quieroSalir = true;
                }
            }
                break;
            default:
                System.out.println("Opcion inexistente. Ingrese una opción válida");
                break;
        }
        }while(quieroSalir == false);
        
    }
    
}
