
package alumnos.app.colecciones;

import Entidades.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;

public class AlumnosAPPColecciones {

    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        ArrayList <Alumno> alumnos = new ArrayList();
        
        as.crearAlumno(alumnos);
        as.notaFinal(alumnos);
    }
    
}
