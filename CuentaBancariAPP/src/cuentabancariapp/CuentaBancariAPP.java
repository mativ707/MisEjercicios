
package cuentabancariapp;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import java.util.Scanner;

public class CuentaBancariAPP {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria cb = new CuentaBancaria();
        boolean salir = false;
        
        do {
            System.out.println("CuentaBancariAPP");
            System.out.println("1.Ingresar datos de usuario nuevo");
            System.out.println("2.Ingresar dinero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Extracción rápida");
            System.out.println("5.Consultar saldo");
            System.out.println("6.Consultar datos");
            System.out.println("7.Salir");
            
            
            int opcion = leer.nextInt();
            
        switch (opcion) {
            case 1:
                cbs.cargaDatos();
                break;
            case 2:
                System.out.println("Cuanto dinero va a ingresar?");
                double dinero = leer.nextDouble();
                cbs.ingresar(dinero);
                break;
            case 3:
                System.out.println("Cuanto dinero va a retirar?");
                double retiro = leer.nextDouble();
                cbs.retirarSaldo(retiro);
                break;
            case 4:
                System.out.println();
                cbs.extracciónRápida();
                break;
            case 5:
                System.out.println("Su saldo actual es de " + cbs.consultarSaldo());
                break;
            case 6:
             cbs. consultarDatos();
             break;
            case 7:
                System.out.println("Saliendo...");
                salir = true;
                break;
            }
        } while(salir == false);
        
    }
    
}
