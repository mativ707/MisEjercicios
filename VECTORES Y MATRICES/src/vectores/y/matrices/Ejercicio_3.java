/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package vectores.y.matrices;
public class Ejercicio_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vector[] = new int [1000];
        for(int i = 0; i < 1000; i++){
            vector[i]= (int)(Math.random() * 99999);
        }
        
        int unaCifra,dosCifras,tresCifras,cuatroCifras,cincoCifras;
        unaCifra=0;
        dosCifras=0;
        tresCifras=0;
        cuatroCifras=0;
        cincoCifras=0;
        
        for(int i = 0 ; i<1000; i++){
            if(vector[i]>0 && vector[i]<9){
             unaCifra++;   
            }else if(vector[i]>9 && vector[i]<100){
                dosCifras++;
            }else if(vector[i]>99 && vector[i]<1000){
                tresCifras++;
            }else if(vector[i]>999 && vector[i]<10000){
                cuatroCifras++;
            }else{
                cincoCifras++;
            }
        }
        
        System.out.println("NÚMEROS DE UNA CIFRA: "+ unaCifra);
        System.out.println("NÚMEROS DE DOS CIFRAS: "+ dosCifras);
        System.out.println("NÚMEROS DE TRES CIFRAS: "+ tresCifras);
        System.out.println("NÚMEROS DE CUATRO CIFRAS: "+ cuatroCifras);
        System.out.println("NÚMEROS DE CINCO CIFRAS: "+ cincoCifras);
    }
    
    
}
