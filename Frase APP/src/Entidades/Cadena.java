
package Entidades;

public class Cadena {
    String frase;
    int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

  
}
