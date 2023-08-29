
package profe_app;

import Entidades.Curso;
import Servicios.CursoService;

public class Profe_APP {
    
    public static void main(String[] args) {
        Curso c1 = new Curso();
        CursoService cs = new CursoService();
        
        cs.crearCurso();
        cs.calcularGananciaSemanal();
        
    }
    
}
