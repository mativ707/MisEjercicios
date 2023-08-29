
package Entidades;

public class Cafetera {
    int cantActual;
    int capMax = 10;
//CONSTRUCTORES
    public Cafetera() {
    }

    public Cafetera(int capMax, int cantActual) {
        this.capMax = capMax;
        this.cantActual = cantActual;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getCapMax() {
        return capMax;
    }

    public int getCantActual() {
        return cantActual;
    }
    
    
}
