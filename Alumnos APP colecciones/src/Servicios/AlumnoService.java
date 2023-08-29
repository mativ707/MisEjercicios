
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    Alumno al = new Alumno();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Alumno> alumnos = new ArrayList();
    ArrayList <Integer> notas = new ArrayList();
    
    public void crearAlumno(ArrayList <Alumno> alumnos){
        boolean salir = false;
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            // FOR PARA CARGAR LAS 3 NOTAS POR ALUMNO
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1) + " del alumno " + nombre);
                notas.add(leer.nextInt());
            }
            // SE DA ORIGEN AL ALUMNO
            Alumno al = new Alumno(nombre, notas);
            // SE AGREGA AL ALUMNO A LA LISTA
            alumnos.add(al);
            // PREGUNTAMOS SI DESEA CREAR OTRO ALUMNO
            System.out.println("Desea crear otro alumno? S/N");
            respuesta = leer.next();
            // SE VALIDA LA RESPUESTA
            if (respuesta.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (salir == false);
        
    }
    
    public void notaFinal(ArrayList <Alumno> alumnos){
        boolean validez = true;
        System.out.println("Ingrese el nombre del alumno que desea calcular el promedio: ");
        String alumno = leer.next();
        
        for (Alumno aux : alumnos) {
            if (alumno.equalsIgnoreCase(aux.getNombre())) {
                System.out.println("El alumno se encontró en la lista."
                        + "\n" + "Se procede a calcular el promedio...");
                double promedio = calcularPromedio(aux.getNotas()); // AQUI SE GUARDAN LAS NOTAS DEL ALUMNO EN LA LISTA
                System.out.println("El promedio de " + aux.getNombre() + " es: " + promedio);
                validez = false;
                break;
            }else{
                validez = true;
            }
        }
        
        if (validez) {
            System.out.println("No se encontró el alumno en la lista. Por favor "
                    + "ingrese el nombre nuevamente.");
        }
    }
    
     public static double calcularPromedio(ArrayList <Integer> notas) {
        int suma = 0;
        for(int aux : notas) {
            suma += aux;
        }
        double promedio = (double)suma / notas.size(); // O PUEDE SER / notas.size()
        return promedio;
    }
}
