/*
 * BlackMadia#1443
 */

package Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    
    private final String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();
    
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while(continuar) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = sc.nextLine();
            
            ArrayList<Integer> notas = new ArrayList<>();
            for(int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                int nota = Integer.parseInt(sc.nextLine());
                notas.add(nota);
            }
            
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);
            
            System.out.print("¿Desea ingresar otro alumno? (s/n): ");
            String respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        System.out.print("\nIngrese el nombre del alumno para calcular su nota final: ");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;
        for(Alumno alumno : listaAlumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                double promedio = calcularPromedio(alumno.getNotas());
                System.out.println("El promedio de " + alumno.getNombre() + " es: " + promedio);
                break;
            }
        }
        if(!encontrado) {
            System.out.println("No se encontró al alumno " + nombreBuscado + " en la lista.");
        }
    }
    
    public static double calcularPromedio(ArrayList<Integer> notas) {
        int suma = 0;
        for(int nota : notas) {
            suma += nota;
        }
        double promedio = (double) suma / notas.size();
        return promedio;
    }
}
