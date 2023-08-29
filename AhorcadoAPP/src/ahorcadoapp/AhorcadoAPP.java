
package ahorcadoapp;

import Entidades.Ahorcado;
import Servicios.AhorcadoService;

public class AhorcadoAPP {

    public static void main(String[] args) {
        AhorcadoService ahs = new AhorcadoService(); 
        Ahorcado ju = new Ahorcado();
        
        ahs.juego();
        
    }
    
}
