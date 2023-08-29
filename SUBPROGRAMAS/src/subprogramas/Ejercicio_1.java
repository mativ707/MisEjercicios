
package subprogramas;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese dos números para operar");
       System.out.println("Ingrese NUM 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese NUM 2:");
        int num2 = leer.nextInt();
        
        
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("El resultado es "+ sumar(num1,num2));
                break;
            case 2:
                System.out.println("El resultado es "+ resta(num1,num2));
                break;
            case 3:
                System.out.println("El resultado es "+ multiplicación(num1,num2));
                break;
            case 4:
                System.out.println("El resultado es "+ división(num1,num2));
                break;
        }
    }
    
    public static int sumar(int num1,int num2){
        int resSuma;
        resSuma = num1+num2;
        return resSuma;
    }
    
    public static int resta(int num1,int num2){
        int resResta;
        resResta = num1-num2;
        return resResta;
    }
    
    public static int multiplicación(int num1,int num2){
        int resMultip;
        resMultip = num1 * num2;
        return resMultip;
    }
    
    public static int división(int num1, int num2){
        int resDivis;
        resDivis = num1/num2;
        return resDivis;
    }
    
}
