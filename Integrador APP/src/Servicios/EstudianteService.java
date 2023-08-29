
package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
    //estudiantes con sus respectivas notas.
    //Una vez creado los estudiantes deberemos guardar los estudiantes en un
    //arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
    //dos tareas que nos ha pedido la escuela.
public class EstudianteService {
    Estudiante e1 = new Estudiante();
    Estudiante estudiantes[] = new Estudiante[8]; // ARREGLO DE OBJETOS
    Scanner leer = new Scanner(System.in);
    
    public void crear(){
        String nombre;
        double nota;
        int pos = 1;
        
        for(int j = 0 ; j < 8 ; j++){
            
            System.out.println("Ingrese el nombre del estudiante "+ pos);
            nombre = leer.next();
            System.out.println("Ingrese la nota final del estudiante "+ pos);
            nota = leer.nextDouble();
            
            pos++;
            estudiantes[j] = new Estudiante(nombre, nota);
        }
    }
    
    //1. Calcular y mostrar el promedio de notas de todo el curso
   //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
   //nota mayor al promedio del curso
   //3. Por último, deberemos mostrar todos los estudiantes con una nota
   //mayor al promedio.
    
    public String[] promedio(){
        String alumnos[] = new String[8];
        double notasPromedio = 0.0;
        double promedio;
        
        // ACUMULAMOS LA SUMA DE NOTAS
        for(int j = 0 ; j < 8 ; j++){
            notasPromedio = notasPromedio + estudiantes[j].getNota();
        }
        // OBTENEMOS EL PROMEDIO
        //System.out.println("El promedio es de " + notasPromedio / 8);
        promedio = notasPromedio / 8;
        // SEPARAMOS A LOS DE PROMEDIO MAYOR POR NOMBRE
        
        for(int j = 0 ; j < 8 ; j++){
            if(estudiantes[j].getNota() > promedio){
                alumnos[j] = estudiantes[j].getNombre();
            }
        }
        
        return alumnos;
    }
    
    public void mostrarEstudiantes(){
        String alumnos[] = promedio();
        
        System.out.println("Los estudiantes con nota mayor al promedio son: ");
        
        for(int j = 0 ;j<8; j++){
            if(alumnos[j] != null){
               System.out.println("[" + alumnos[j] + "]"); 
            }
        }
    }
}
