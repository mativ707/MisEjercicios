package integrador.app;

import Entidades.Estudiante;
import Servicios.EstudianteService;

public class IntegradorAPP {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(); 
        EstudianteService es = new EstudianteService();
        
        //for(int i = 2 ; i<= 128; i*=2){
        //    System.out.println("i" + i);
        //}
        
        es.crear();
        es.promedio();
        es.mostrarEstudiantes();
    }
    
}
