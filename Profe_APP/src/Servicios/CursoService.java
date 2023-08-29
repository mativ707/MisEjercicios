
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    Curso c1 = new Curso();
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(){
    System.out.println("CARGA DE ALUMNOS"); // SOUT + TAB  
    String alumnos[] = new String [5];
        
    for(int j = 0 ;  j < 5; j++){
        System.out.println("Ingrese el nombre del alumno "+ j+1);
        alumnos[j] = leer.next();
    }
    c1.setAlumnos(alumnos);
}
    
    public void crearCurso(){
        cargarAlumnos();
        
        System.out.println("Ingrese la cantidad de horas por día: ");
        c1.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese el turno: ");
        c1.setTurno(leer.next());
        
        System.out.println("Ingrese el precio por hora: ");
        c1.setPrecioPorHora(leer.nextInt());
    }
    
    public void calcularGananciaSemanal(){
        int ganancia = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * 5 * c1.getCantidadDiasPorSemana();
        System.out.println("La ganancia en una semana por curso es de " + ganancia + "$");
    }
}
