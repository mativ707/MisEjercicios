
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {
    ParDeNumeros pdn = new ParDeNumeros();
    
    public void mostrarValores(){
        System.out.println("NUM 1: "+pdn.getNum1() + "\n" + "NUM 2: " + pdn.getNum2()+"\n");
    }
    
    public void devolverMayor(){
        System.out.println("El mayor de ambos es " + Math.max(pdn.getNum1(), pdn.getNum2())+"\n");
    }
    
    public double calcularPotencia(){
        double mayor = Math.max(pdn.getNum1(), pdn.getNum2());
        double menor = Math.min(pdn.getNum1(), pdn.getNum2());
        
        mayor = Math.round(mayor); // AQUI SE REDONDEAN
        menor = Math.round(menor);
        
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz(){
        double menor = Math.min(pdn.getNum1(), pdn.getNum2());
        
        // SE OBTIENE EL VALOR ABSOLUTO
        menor = Math.abs(menor);
        // SE OBTIENE LA RAIZ CUADRADA
        return Math.sqrt(menor);
    }
}
