
package paises.colecciones.app;

import Servicios.PaisesService;
import java.util.HashSet;

public class PaisesColeccionesAPP {

    public static void main(String[] args) {
        HashSet<String> paises = new HashSet();
        PaisesService ps = new PaisesService();
        
        ps.agregarPais(paises);
        ps.ordenarPaises(paises);
        ps.eliminarPais(paises);
    }
    
}
