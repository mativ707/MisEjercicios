
package Entidades;

import java.util.Date;

public class Persona {
    String nombre;
    int año,mes,dia;
    Date fechaNac = new Date(año-1900,mes-1,dia);

    // PARA DEVOLVER EL TO STRING EN INSERT
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    public Persona() {
    }

    public Persona(String nombre, int año, int mes, int dia) {
        this.nombre = nombre;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

   

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
