package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicios {
    private Scanner leer = new Scanner(System.in);
    
    CuentaBancaria cb1 = new CuentaBancaria();
    
    public void cargaDatos(){
       System.out.println("Ingrese su DNI");
       cb1.setDniCliente(leer.nextLong());
    }
    
    public void ingresar(double dinero){
       
     cb1.setSaldoActual(cb1.getSaldoActual()+ dinero);
     System.out.println("Su saldo actual es de "+ cb1.getSaldoActual()+"$");
     
    }
     
    public String consultarSaldo(){
    //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
     return "" + cb1.getSaldoActual();
    }
     
    public void retirarSaldo(double retiro){
        System.out.println("Ingrese saldo a retirar: ");
        retiro = leer.nextDouble();
        while (retiro > cb1.getSaldoActual()){
         System.out.println("El retiro que desea realizar supera el saldo de su cuenta.");
         System.out.println("Ingrese una cantidad menor");
         retiro = leer.nextDouble();
        }
        cb1.setSaldoActual( cb1.getSaldoActual()- retiro);    
    }
    
    public void consultarDatos(){
        System.out.println("Su numero de identidad es "+ cb1.getDniCliente());
        System.out.println("Su numero de cuneta es "+  cb1.getNumeroCuenta());
        System.out.println();
    }
    
    public void extracciónRápida(){
        double rapida = cb1.getSaldoActual()*0.2;
        System.out.println("Retirando el 20% de su saldo actual...");
        cb1.setSaldoActual(cb1.getSaldoActual() - rapida);
    }
}


