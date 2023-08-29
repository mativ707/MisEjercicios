
package razas.perros;

import Servicios.RazaService;
import java.util.ArrayList;

public class RazasPerros {

    public static void main(String[] args) {
        ArrayList <String> razas = new ArrayList();
        RazaService rs = new RazaService();
        
        rs.agregarRaza(razas);
        rs.mostrarRaza(razas);
        rs.buscarPerro(razas);
        
    }
    
}
