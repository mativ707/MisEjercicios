
package meses.app;

import Entidades.Meses;
import Servicios.MesesService;

public class MesesAPP {

    public static void main(String[] args) {
        Meses m1 = new Meses();
        MesesService ms = new MesesService();
        
        ms.llenarArray();
        ms.adivinar();
        
    }
    
}
